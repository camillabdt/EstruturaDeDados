import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Mapa<Integer, Veiculo> mapaVetor = new MapaVetorOrdenado<>();
        Mapa<Integer, Veiculo> mapaABB = new MapaABB<>();
        Mapa<Integer, Veiculo> mapaAVL = new MapaAVL<>();

        executarTestes(mapaVetor, "Vetor Ordenado");
        executarTestes(mapaABB, "Árvore Binária de Busca (ABB)");
        executarTestes(mapaAVL, "Árvore Binária Balanceada (AVL)");
    }

    private static void executarTestes(Mapa<Integer, Veiculo> mapa, String tipoMapa) {
        long tempoInicio, tempoFim;
        Veiculo[] veiculos = gerarVeiculos(100000);

        // Inserir 100.000 veículos
        tempoInicio = System.nanoTime();
        for (Veiculo veiculo : veiculos) {
            mapa.inserir(veiculo.getChassi(), veiculo);  // Usando getChassi()
        }
        tempoFim = System.nanoTime();
        System.out.println("Tempo de inserção (" + tipoMapa + "): " + (tempoFim - tempoInicio) + " nanosegundos");

        // Apresentar todos os veículos em ordem crescente de número de chassi
        tempoInicio = System.nanoTime();
        Collection<Veiculo> todosVeiculos = mapa.valores();
        tempoFim = System.nanoTime();
        System.out.println("Tempo de exibição (" + tipoMapa + "): " + (tempoFim - tempoInicio) + " nanosegundos");

        // Verificar quantos veículos são da marca Ford
        tempoInicio = System.nanoTime();
        long contadorFord = todosVeiculos.stream().filter(Veiculo::isMarcaFord).count();  // Usando isMarcaFord()
        tempoFim = System.nanoTime();
        System.out.println("Tempo de contagem de veículos Ford (" + tipoMapa + "): " + (tempoFim - tempoInicio) + " nanosegundos");

        // Remover todos os veículos com número de chassi igual ou inferior a 202050000
        tempoInicio = System.nanoTime();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getChassi() <= 202050000) {  // Usando getChassi()
                mapa.remover(veiculo.getChassi());
            }
        }
        tempoFim = System.nanoTime();
        System.out.println("Tempo de remoção (" + tipoMapa + "): " + (tempoFim - tempoInicio) + " nanosegundos");
    }

    private static Veiculo[] gerarVeiculos(int quantidade) {
        Veiculo[] veiculos = new Veiculo[quantidade];
        for (int i = 0; i < quantidade; i++) {
            veiculos[i] = new Veiculo();  // Usando o construtor padrão
        }
        return veiculos;
    }
}
