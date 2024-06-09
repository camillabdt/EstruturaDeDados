public class LDE {
    private Noh inicio;


    public LDE() {
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



    public int tamanho() {
        int tamanho = 0;
        Noh aux = inicio;

        while (aux != null) {
            tamanho++;
            aux = aux.getProximo();
        }
        return tamanho;
    }

    public void imprimeListaInicio() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

    public void concat(LDE l) {
        Noh aux = l.inicio;
        while (aux != null) {
            this.insereFim(aux.getInfo());
            aux = aux.getProximo();
        }
    }
}