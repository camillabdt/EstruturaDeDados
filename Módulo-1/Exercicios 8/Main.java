import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[1000];
        Random rand = new Random();

        // Gerando o vetor com 1000 elementos aleatórios
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        // Copiando o vetor para garantir que os três métodos utilizem os mesmos dados
        int[] arrayParaBolha = array.clone();
        int[] arrayParaSelecao = array.clone();
        int[] arrayParaInsercao = array.clone();

        // Ordenação usando Bubble Sort e medindo o tempo de execução
        long tempoInicial = System.nanoTime();
        OrdenacaoBolha.ordenacaoBolha(arrayParaBolha);
        long tempoFinal = System.nanoTime();
        System.out.println("Ordenação Bolha levou " + (tempoFinal - tempoInicial) + " nanosegundos");

        // Ordenação usando Selection Sort e medindo o tempo de execução
        tempoInicial = System.nanoTime();
        OrdenacaoSelecao.ordenacaoSelecao(arrayParaSelecao);
        tempoFinal = System.nanoTime();
        System.out.println("Ordenação Seleção levou " + (tempoFinal - tempoInicial) + " nanosegundos");

        // Ordenação usando Insertion Sort e medindo o tempo de execução
        tempoInicial = System.nanoTime();
        OrdenacaoInsercao.ordenacaoInsercao(arrayParaInsercao);
        tempoFinal = System.nanoTime();
        System.out.println("Ordenação Inserção levou " + (tempoFinal - tempoInicial) + " nanosegundos");
    }
}
