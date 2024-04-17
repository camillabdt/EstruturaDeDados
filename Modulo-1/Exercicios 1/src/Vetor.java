import java.util.Random;

public class Vetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
    }

    public void preencherAleatoriamente() {
        Random rand = new Random();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = rand.nextInt(1000) + 1;  // Números de 1 a 1000
        }
    }

    public int maiorElementoRecursivo(int inicio, int fim) {
        if (inicio == fim) {
            return elementos[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            int maiorEsquerda = maiorElementoRecursivo(inicio, meio);
            int maiorDireita = maiorElementoRecursivo(meio + 1, fim);
            return Math.max(maiorEsquerda, maiorDireita);
        }
    }

    public int maiorElementoIterativo() {
        int maior = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }

    public int[] getElementos() {
        return elementos;
    }
}
