public class Lista {
    private No primeiro;

    public Lista() {
        this.primeiro = null;
    }

    public void inserir(Object dado) {
        No novoNo = new No(dado);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void imprimir() {
        No atual = primeiro;
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }
}
