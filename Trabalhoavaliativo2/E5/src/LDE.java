public class LDE {
    private Noh inicio;
    private Noh novoNoh;

    public LDE (){
        this.inicio = null;
    }

    public void insereInicio(Object info) {
        Noh novoNoh = new Noh(info);

        if (inicio == null)
            inicio = novoNoh;
        else {
            novoNoh.setProximo(novoNoh);
            inicio = novoNoh;
        }
    }

    public void insereFim(Object info) {
        Noh novoNoh = new Noh(info);
        Noh aux = inicio;

        if (inicio == null)
            inicio = novoNoh;
        else {
            while (aux.getProximo() != null)
                aux = aux.getProximo();
            aux.setProximo(novoNoh);
        }
    }

    public boolean estaVazio() {
        return inicio == null;
    }

    public boolean remove(Object info) {
        Noh atual;
        Noh anterior = null;
        atual = inicio;


        while (atual!=null && atual.getInfo() != info){
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual==null)
            return false;
        if (anterior==null)
            inicio = atual.getProximo();
        else
            anterior.setProximo(novoNoh);

        return true;
    }

    public int tamanho() {
        int tamanho = 0;
        Noh aux = inicio;

        while (aux != null) {
            tamanho++;
            aux = aux.getProximo();
        }
        return tamanho;
    }

    public Object getPrimeiro() {
        return inicio.getInfo();
    }

    public Object getUltimo() {
        Noh aux = inicio;
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        return aux.getInfo();
    }

    public void imprime() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

    public void imprime_rec() {
        imprime_rec(inicio);
    }

    private void imprime_rec(Noh Noh) {
        if (Noh == null) {
            return;
        }

        System.out.println(Noh.getInfo());

        imprime_rec(Noh.getProximo());
    }


}