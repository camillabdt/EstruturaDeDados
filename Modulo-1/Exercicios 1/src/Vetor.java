import java.util.Random;

public class Vetor2 implements IVetor {
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

    // Método adaptado para seguir a pseudolinguagem fornecida
    public int maximoRec(int inicio, int fim) {
        if (inicio == fim) {
            return elementos[inicio];  // Caso base: o segmento tem apenas um elemento
        } else {
            int meio = (inicio + fim) / 2;
            int max1 = maximoRec(inicio, meio);  // Recursão na metade esquerda
            int max2 = maximoRec(meio + 1, fim);  // Recursão na metade direita
            return Math.max(max1, max2);  // Retorna o maior entre os dois máximos encontrados
        }
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
