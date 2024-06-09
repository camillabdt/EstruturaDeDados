import java.util.Random;

public class Vetor {

    Random random = new Random();
    private int[] vetor;
    private int total;

    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
    }

    public Vetor() {
        vetor = new int[10];
    }

    public void adiciona(int numero) {
        this.garanteEspaco();
        this.vetor[total] = numero;
        total++;
    }

    public int tamanho() {
        return total;
    }

    public boolean contem(int numero) {
        for (int i = 0; i < this.total; i++) {
            if (numero == this.vetor[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean cheio() {
        return total == this.vetor.length;
    }

    private void garanteEspaco() {
        if (this.cheio()) {
            int[] novos = new int[this.vetor.length * 2];
            System.arraycopy(this.vetor, 0, novos, 0, this.vetor.length);
            this.vetor = novos;
        }
    }

    public void gerandoAleatorio() {
        for (int i = 0; i < vetor.length; i++) {
            adiciona(random.nextInt(100));
        }
    }

    public void imprime() {
        for (int i = 0; i < total; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public String getIntersecao(Vetor vetor2) {
        StringBuilder intersecao = new StringBuilder();
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < vetor2.tamanho(); j++) {
                if (vetor[i] == vetor2.vetor[j]) {
                    intersecao.append(vetor[i]).append(" ");
                }
            }
        }
        return "Em comum: " + intersecao.toString();
    }

    public void selectionSort() {
        for (int i = total - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (vetor[j] > vetor[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Troca o maior elemento encontrado com o elemento na posição i
            int temp = vetor[i];
            vetor[i] = vetor[maxIndex];
            vetor[maxIndex] = temp;
            // Mostra o estado do vetor após a troca
            imprime();
        }
    }
}
