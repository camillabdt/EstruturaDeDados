import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Supermercado {
    private List<Caixa> caixas;
    private List<Fila> filas;
    private Random random;

    public Supermercado(int numeroDeCaixas) {
        caixas = new ArrayList<>(numeroDeCaixas);
        filas = new ArrayList<>(numeroDeCaixas);
        random = new Random();
        for (int i = 0; i < numeroDeCaixas; i++) {
            caixas.add(new Caixa());
            filas.add(new Fila());
        }
    }

    public void simularPassoDeTempo() {
        // Simular chegada de novos clientes
        if (random.nextInt(100) < 10) { // 10% de chance de um novo cliente chegar
            int tempoDeAtendimento = random.nextInt(11) + 5; // Tempo entre 5 e 15
            Cliente novoCliente = new Cliente(tempoDeAtendimento);
            Fila filaMenor = filas.stream().min((f1, f2) -> Integer.compare(f1.tamanho(), f2.tamanho())).orElse(null);
            if (filaMenor != null) {
                filaMenor.adicionarCliente(novoCliente);
            }
            System.out.println("Novo cliente chegou: " + novoCliente);
        }

        // Processar atendimento dos clientes nos caixas
        for (int i = 0; i < caixas.size(); i++) {
            Caixa caixa = caixas.get(i);
            if (caixa.getClienteAtual() == null && !filas.get(i).estaVazia()) {
                caixa.atenderCliente(filas.get(i).removerCliente());
            }
            caixa.processarAtendimento();
        }

        // Exibir estado atual das filas e caixas
        for (int i = 0; i < caixas.size(); i++) {
            System.out.println("Caixa " + (i + 1) + ": " + caixas.get(i).toString());
            System.out.println("Fila " + (i + 1) + ": " + filas.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado(3); // Exemplo com 3 caixas
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aperte enter para simular um passo de tempo...");
        while (true) { // Loop infinito para simular o tempo
            scanner.nextLine(); // Espera a entrada do usuário
            supermercado.simularPassoDeTempo();
            System.out.println("--------------------");
        }
    }
}
