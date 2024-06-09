
public class Teste {

    public void bubbleSort(int[] vetor) {
        System.out.println("==================");
        System.out.println("   Bubble Sort:");
        System.out.println("==================");
        mostrarVetor(vetor);

        int n = vetor.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca(vetor, j, j + 1);
                    trocou = true;
                    mostrarVetor(vetor);
                }
            }

            if (!trocou) {
                break;
            }
        }
    }

    public void selectionSort(int[] vetor) {
        System.out.println("==================");
        System.out.println("  Selection Sort:");
        System.out.println("==================");
        mostrarVetor(vetor);

        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                troca(vetor, i, indiceMenor);
                mostrarVetor(vetor);
            }
        }
    }

    public void insertionSort(int[] vetor) {
        System.out.println("==================");
        System.out.println("  Insertion Sort:");
        System.out.println("==================");
        mostrarVetor(vetor);

        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = chave;
            mostrarVetor(vetor);
        }
    }

    public static void troca(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public void mostrarVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}