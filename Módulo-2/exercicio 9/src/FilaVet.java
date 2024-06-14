public class FilaVet implements IFila {
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet(int tamFila) {
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    @Override
    public boolean add(Object info) {
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    @Override
    public boolean remove() {
        if (this.isEmpty()) {
            System.out.println("Fila está vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return this.nElemFila == 0;
    }

    @Override
    public int size() {
        return this.nElemFila;
    }

    @Override
    public void print() {
        if (this.isEmpty()) {
            System.out.println("Fila está vazia");
            return;
        }
        System.out.print("Fila: ");
        for (int i = 0; i < this.nElemFila; i++) {
            int index = (this.inicio + i) % this.vetFila.length;
            System.out.print(this.vetFila[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FilaVet fila = new FilaVet(5);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.print();  // Fila: 2 3 4

        fila.remove();
        fila.print();  // Fila: 3 4

        fila.add(9);
        fila.add(10);
        fila.add(11);  // Capacidade da fila esgotou, pois o tamanho máximo é 5
        fila.print();  // Fila: 3 4 9 10 11

        fila.remove();
        fila.add(15);
        fila.print();  // Fila: 4 9 10 11 15
    }
}