public class Main {

    public static void main(String[] args) {
        LDE lista = new LDE();

        lista.insereFim(1);
        lista.insereFim(3);
        lista.insereFim(5);
        lista.insereFim(6);
        lista.add_ordenado(2);
        lista.add_ordenado(4);
        lista.add_ordenado(7);

        System.out.println("Lista em Ordem: ");
        lista.imprimeListaInicio();

    }

}