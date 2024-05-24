import java.util.Random;

public class Vetor implements IVetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
    }

    @Override
    public void preencherAleatoriamente() {
        Random rand = new Random();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = rand.nextInt(1000) + 1;  // Números de 1 a 1000
        }
    }
    public int maximoRec(int inicio, int fim) {
        if (inicio == fim) {
            return elementos[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            int max1 = maximoRec(inicio, meio);
            int max2 = maximoRec(meio + 1, fim);
            return Math.max(max1, max2);
        }
    }

    public int maximoRec() {
        return maximoRec(0, elementos.length - 1);
    }

    @Override
    public int maiorElementoIterativo() {
        int maior = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }
}
