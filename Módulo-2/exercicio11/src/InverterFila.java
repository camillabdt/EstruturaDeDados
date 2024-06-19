public class InverterFila {
    public static <T> void inverterFila(FilaLSE<T> fila) {
        PilhaLista<T> pilha = new PilhaLista<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.dequeue());
        }

        while (!pilha.isEmpty()) {
            fila.enqueue(pilha.pop());
        }
    }

    public static void main(String[] args) {
        FilaLSE<String> fila = new FilaLSE<>();
        fila.enqueue("Camilla");
        fila.enqueue("Gabriela");
        fila.enqueue("Guilherme");

        System.out.println("Fila original:");
        fila.printQueue();

        inverterFila(fila);

        System.out.println("Fila invertida:");
        fila.printQueue();
    }
}
