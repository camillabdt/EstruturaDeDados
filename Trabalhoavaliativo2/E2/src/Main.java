public class Main {
    public static void main(String[] args) {
        Vetor numeros = new Vetor(10);
        numeros.gerandoAleatorio();
        System.out.println("Vetor antes da ordenação:");
        numeros.imprime();

        System.out.println("Processo de ordenação:");
        numeros.selectionSort();

        System.out.println("Vetor após a ordenação:");
        numeros.imprime();
    }
}
