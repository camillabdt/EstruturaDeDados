import java.util.LinkedList;
import java.util.Queue;

public class ABB {
    private Noh raiz;

    public ABB() {
        this.raiz = null;
    }

    public void insere(int valor) {
        this.raiz = insereRec(this.raiz, valor);
    }

    private Noh insereRec(Noh raiz, int valor) {
        if (raiz == null) {
            raiz = new Noh(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.esq = insereRec(raiz.esq, valor);
        } else if (valor > raiz.valor) {
            raiz.dir = insereRec(raiz.dir, valor);
        }

        return raiz;
    }

    // Métodos de busca
    public Noh buscaIter(int valor) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.valor == valor) return aux;
            if (valor < aux.valor) aux = aux.esq;
            else aux = aux.dir;
        }
        return null;
    }

    public Noh buscaRec(int valor) {
        return buscaRec(this.raiz, valor);
    }

    private Noh buscaRec(Noh noh, int valor) {
        if (noh == null || noh.valor == valor) return noh;
        if (valor < noh.valor) return buscaRec(noh.esq, valor);
        else return buscaRec(noh.dir, valor);
    }

    // Métodos de impressão
    public void preOrdem() {
        preOrdem(this.raiz);
    }

    private void preOrdem(Noh noh) {
        if (noh != null) {
            System.out.print(noh.valor + " ");
            preOrdem(noh.esq);
            preOrdem(noh.dir);
        }
    }

    public void emOrdem() {
        emOrdem(this.raiz);
    }

    private void emOrdem(Noh noh) {
        if (noh != null) {
            emOrdem(noh.esq);
            System.out.print(noh.valor + " ");
            emOrdem(noh.dir);
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(Noh noh) {
        if (noh != null) {
            posOrdem(noh.esq);
            posOrdem(noh.dir);
            System.out.print(noh.valor + " ");
        }
    }

    public void imprimeLargura() {
        if (this.raiz == null) return;

        Queue<Noh> fila = new LinkedList<>();
        fila.add(this.raiz);

        while (!fila.isEmpty()) {
            Noh noh = fila.poll();
            System.out.print(noh.valor + " ");

            if (noh.esq != null) fila.add(noh.esq);
            if (noh.dir != null) fila.add(noh.dir);
        }
    }

    // Método de remoção
    public void remove(int valor) {
        this.raiz = removeRec(this.raiz, valor);
    }

    private Noh removeRec(Noh raiz, int valor) {
        if (raiz == null) return raiz;

        if (valor < raiz.valor) {
            raiz.esq = removeRec(raiz.esq, valor);
        } else if (valor > raiz.valor) {
            raiz.dir = removeRec(raiz.dir, valor);
        } else {
            // Caso 1: Nó folha
            if (raiz.esq == null && raiz.dir == null) {
                return null;
            }
            // Caso 2: Nó com um filho
            else if (raiz.esq == null) {
                return raiz.dir;
            } else if (raiz.dir == null) {
                return raiz.esq;
            }
            // Caso 3: Nó com dois filhos
            Noh sucessor = findMin(raiz.dir);
            raiz.valor = sucessor.valor;
            raiz.dir = removeRec(raiz.dir, sucessor.valor);
        }
        return raiz;
    }

    private Noh findMin(Noh noh) {
        while (noh.esq != null) {
            noh = noh.esq;
        }
        return noh;
    }

    // Método principal para teste
    public static void main(String[] args) {
        ABB arvore = new ABB();

        arvore.insere(50);
        arvore.insere(30);
        arvore.insere(20);
        arvore.insere(40);
        arvore.insere(70);
        arvore.insere(60);
        arvore.insere(80);

        System.out.print("Percurso em pré-ordem: ");
        arvore.preOrdem();
        System.out.println();

        System.out.print("Percurso em ordem: ");
        arvore.emOrdem();
        System.out.println();

        System.out.print("Percurso em pós-ordem: ");
        arvore.posOrdem();
        System.out.println();

        System.out.print("Percurso em largura: ");
        arvore.imprimeLargura();
        System.out.println();

        System.out.println("Removendo 20");
        arvore.remove(20);
        System.out.print("Percurso em ordem após remoção: ");
        arvore.emOrdem();
        System.out.println();

        System.out.println("Removendo 30");
        arvore.remove(30);
        System.out.print("Percurso em ordem após remoção: ");
        arvore.emOrdem();
        System.out.println();

        System.out.println("Removendo 50");
        arvore.remove(50);
        System.out.print("Percurso em ordem após remoção: ");
        arvore.emOrdem();
        System.out.println();
    }
}
