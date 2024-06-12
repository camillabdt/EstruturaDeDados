public class FilaLista implements IFila {
    private Noh inicio;
    private Noh fim;
    private int tamanho;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    @Override
    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if (this.isEmpty()) {
            inicio = novo;
        } else {
            fim.setProx(novo);
        }
        fim = novo;
        tamanho++;
        return true;
    }

    @Override
    public boolean remove() {
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProx();
            }
            tamanho--;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public int size() {
        return tamanho;
    }

    public void imprimirFila() {
        Noh atual = inicio;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FilaLista fila = new FilaLista();
        fila.add("Aluno 1");
        fila.add("Aluno 2");
        fila.add("Aluno 3");
        fila.imprimirFila();

        fila.remove();
        fila.imprimirFila();
    }
}
