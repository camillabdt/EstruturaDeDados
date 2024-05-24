import java.util.Arrays;

public class TADVetor implements IVetor {
    private int[] vetor;
    private int tamanho;

    public TADVetor(int capacidade) {
        this.vetor = new int[capacidade];
        this.tamanho = 0;
    }

    @Override
    public void inserir(int valor) {
        if (tamanho < vetor.length) {
            vetor[tamanho] = valor;
            tamanho++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Vetor cheio");
        }
    }

    @Override
    public int obter(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return vetor[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice fora do intervalo");
        }
    }

    @Override
    public void ordenar() {
        Arrays.sort(vetor, 0, tamanho);
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public int[] getVetor() {
        return Arrays.copyOf(vetor, tamanho);
    }
}
