public class Noh {

    private Object info;
    private Noh proximo;

    public Noh (Object info){
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() {return this.info;}
    public Noh getProximo() {return this.proximo;}
    public Noh setProximo(Noh n) { return this.proximo = n; }
}