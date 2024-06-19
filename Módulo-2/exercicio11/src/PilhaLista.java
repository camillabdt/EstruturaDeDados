public class PilhaLista<T> implements IPilha<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    public PilhaLista() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public boolean push(T info) {
        Node newNode = new Node(info);
        newNode.next = top;
        top = newNode;
        size++;
        return true;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
