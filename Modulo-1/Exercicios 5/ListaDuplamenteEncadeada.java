public class ListaDuplamenteEncadeada {
    private No primeiro;
    private No ultimo;

    public void adiciona(Object elemento) {
        No novoNo = new No(elemento);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
        }
        ultimo = novoNo;
    }

    public void remove(Object elemento) {
        No no = busca(elemento);
        if (no != null) {
            if (no == primeiro) {
                primeiro = no.proximo;
                if (primeiro != null) {
                    primeiro.anterior = null;
                } else {
                    ultimo = null;
                }
            } else if (no == ultimo) {
                ultimo = no.anterior;
                ultimo.proximo = null;
            } else {
                no.anterior.proximo = no.proximo;
                no.proximo.anterior = no.anterior;
            }
        }
    }

    private No busca(Object elemento) {
        No atual = primeiro;
        while (atual != null) {
            if (atual.elemento.equals(elemento)) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void imprimeSentidoDireto() {
        No atual = primeiro;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }

    public void imprimeSentidoReverso() {
        No atual = ultimo;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.anterior;
        }
    }

    private static class No {
        Object elemento;
        No proximo;
        No anterior;

        public No(Object elemento) {
            this.elemento = elemento;
            this.proximo = null;
            this.anterior = null;
        }
    }
}
