public class LDE {
    private Noh inicio;

    public LDE (){
        this.inicio = null;
    }

    public void insereInicio(int info) {
        Noh novoNoh = new Noh(info);

        if (inicio == null)
            inicio = novoNoh;
        else {
            novoNoh.setProximo(inicio);
            inicio = novoNoh;
        }
    }

    public void insereFim(int info) {
        Noh novoNoh = new Noh(info);
        if (inicio == null)
            inicio = novoNoh;
        else {
            Noh ultimo = null;
            for(Noh i= inicio; i != null; i = i.getProximo()) {
                ultimo = i;
                ultimo.setProximo(novoNoh);
            }
        }
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public boolean remove(int info) {
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
            anterior.setProximo(atual.getProximo());

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

    public int getPrimeiro() {
        return inicio.getInfo();
    }

    public int getUltimo() {
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


    public void bubbleSort() {

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            for(Noh j = inicio; j != null; j = j.getProximo()) {
                if( i.getInfo() <  j.getInfo()) {
                    int aux = i.getInfo();
                    i.setInfo(j.getInfo());
                    j.setInfo(aux);
                }
            }
        }


    }

    public String imprimeString(){
        String s = "";
        Noh aux = inicio;
        while (aux != null) {
            s += aux.getInfo() + " ";
            aux = aux.getProximo();
        }
        return s;
    }

    public void imprimeEmOrdem() {
        Noh aux = inicio;

        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }

}