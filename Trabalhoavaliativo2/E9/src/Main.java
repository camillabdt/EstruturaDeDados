public class Main {
    public static void main (String[] args){
        Teste teste = new Teste();

        int[] vetor = {7, 1, 1, 3, 2};

        System.out.println("Vetor original: ");
        teste.mostrarVetor(vetor);
        teste.bubbleSort(vetor.clone());

    }
}