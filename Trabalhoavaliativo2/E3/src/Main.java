public class Main {
    public static void main(String[] args){

        LDE lde = new LDE();
        lde.insereFim(1);
        lde.insereFim(2);
        lde.insereFim(3);
        lde.insereFim(4);
        lde.insereFim(5);
        lde.insereFim(6);
        lde.insereFim(7);
        lde.insereFim(8);
        lde.insereFim(9);
        lde.insereFim(10);

        System.out.println("Quantidade de números pares: "+ lde.nroPares());

    }
}