public class Noh {

    private int info;
    private Noh proximo;

    public Noh (int info){
        this.info = info;
        this.proximo = null;
    }

    public int getInfo() {return this.info;}
    public Noh getProximo() {return this.proximo;}
    public Noh setProximo(Noh n) { return this.proximo = n; }

    public int setInfo(int info) {return this.info;}
}