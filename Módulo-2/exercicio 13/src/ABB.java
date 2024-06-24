public class ABB {
    private Noh raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(Noh node, int element) {
        if (element < node.valor) {
            if (node.esq == null) {
                Noh newNode = new Noh(element);
                node.esq = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.esq, element);
        } else {
            if (node.dir == null) {
                Noh newNode = new Noh(element);
                node.dir = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.dir, element);
        }
    }

    public Noh busca(int valor) {
        return busca(this.raiz, valor);
    }

    private Noh busca(Noh node, int valor) {
        if (node == null || node.valor == valor) {
            return node;
        }
        if (valor < node.valor) {
            return busca(node.esq, valor);
        } else {
            return busca(node.dir, valor);
        }
    }

    public void imprimeEmOrdem() {
        imprimeEmOrdem(this.raiz);
    }

    private void imprimeEmOrdem(Noh node) {
        if (node != null) {
            imprimeEmOrdem(node.esq);
            System.out.print(node.valor + " ");
            imprimeEmOrdem(node.dir);
        }
    }

    public void imprimePreOrdem() {
        imprimePreOrdem(this.raiz);
    }

    private void imprimePreOrdem(Noh node) {
        if (node != null) {
            System.out.print(node.valor + " ");
            imprimePreOrdem(node.esq);
            imprimePreOrdem(node.dir);
        }
    }

    public void imprimePosOrdem() {
        imprimePosOrdem(this.raiz);
    }

    private void imprimePosOrdem(Noh node) {
        if (node != null) {
            imprimePosOrdem(node.esq);
            imprimePosOrdem(node.dir);
            System.out.print(node.valor + " ");
        }
    }
}
