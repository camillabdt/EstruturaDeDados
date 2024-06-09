public class Main {
    public static void main(String[] args) {
        Teste teste = new Teste();

        int[] vetor = {3, 7, 1, 4, 9, 2};

        System.out.println("Vetor original: ");
        teste.mostrarVetor(vetor);
        teste.bubbleSort(vetor.clone());
        teste.selectionSort(vetor.clone());
        teste.insertionSort(vetor.clone());
    }

}
