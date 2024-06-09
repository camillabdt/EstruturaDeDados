public class LDE {
    private Noh inicio;
    private Noh fim;

    public LDE (){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        Noh novoNoh = new Noh(info);

        if (inicio == null){
            inicio = novoNoh;
            fim = novoNoh;
        }
        else {
            novoNoh.setProximo(inicio);
            inicio.setAnterior(novoNoh);
            inicio = novoNoh;
        }
    }

    public void insereFim(int info) {
        Noh novoNoh = new Noh(info);


        if (inicio == null){
            inicio = novoNoh;
            fim = novoNoh;
        }
        else {
            novoNoh.setAnterior(fim);
            fim.setProximo(novoNoh);
            fim = novoNoh;
        }
    }

    public void imprimeListaInicio() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

    public void imprimeListaFim() {
        Noh aux = fim;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getAnterior();
        }
    }

    public int nroPares() {
        int par = 0;
        Noh aux = inicio;
        while (aux != null) {
            if (aux.getInfo() % 2 == 0) {
                par++;
            }
            aux = aux.getProximo();
        }
        return par;
    }

    public void add_ordenado(int info) {

        Noh novoNoh = new Noh(info);

        if (inicio == null) {
            inicio = novoNoh;
            fim = novoNoh;
        } else if (info < inicio.getInfo()) {
            novoNoh.setProximo(inicio);
            inicio.setAnterior(novoNoh);
            inicio = novoNoh;
        } else if (info > fim.getInfo()) {
            novoNoh.setAnterior(fim);
            fim.setProximo(novoNoh);
            fim = novoNoh;
        } else {
            Noh a = inicio;

            while (a != null && a.getInfo() < info) {
                a = a.getProximo();
            }

            novoNoh.setProximo(a);
            novoNoh.setAnterior(a.getAnterior());
            a.getAnterior().setProximo(novoNoh);
            a.setAnterior(novoNoh);
        }
    }

}