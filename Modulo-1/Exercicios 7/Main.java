import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanhoVetor = 1000;
        IVetor tadVetor = new TADVetor(tamanhoVetor);
        Random random = new Random();

        for (int i = 0; i < tamanhoVetor; i++) {
            tadVetor.inserir(random.nextInt(10000));
        }

        tadVetor.ordenar();
        int[] vetorOrdenado = tadVetor.getVetor();
        int elementoProcurado = vetorOrdenado[vetorOrdenado.length - 1]; // Usando o último elemento

        long inicio, fim, tempoIterativo, tempoRecursivo;

        // Pesquisa Binária Iterativa
        inicio = System.nanoTime();
        int resultadoIterativo = PesquisaBinaria.pesquisaBinariaIterativa(vetorOrdenado, elementoProcurado);
        fim = System.nanoTime();
        tempoIterativo = fim - inicio;

        // Pesquisa Binária Recursiva
        inicio = System.nanoTime();
        int resultadoRecursivo = PesquisaBinaria.pesquisaBinariaRecursiva(vetorOrdenado, elementoProcurado, 0, vetorOrdenado.length - 1);
        fim = System.nanoTime();
        tempoRecursivo = fim - inicio;

        System.out.println("Elemento procurado: " + elementoProcurado);
        System.out.println("Resultado (Iterativo): " + resultadoIterativo + ", Tempo: " + tempoIterativo + " ns");
        System.out.println("Resultado (Recursivo): " + resultadoRecursivo + ", Tempo: " + tempoRecursivo + " ns");
    }
}
