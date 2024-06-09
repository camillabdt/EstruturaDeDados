public class Main {
    public static void main(String[] args) {
        LDE lista = new LDE();
        LDE lista2 = new LDE();

        lista.insereFim(1);
        lista.insereFim(2);
        lista.insereFim(3);
        lista.insereFim(4);
        System.out.println("--------------------------");
        System.out.println("Lista 1: ");
        lista.imprimeListaInicio();

        lista2.insereFim(5);
        lista2.insereFim(6);
        lista2.insereFim(7);
        lista2.insereFim(8);
        System.out.println("--------------------------");
        System.out.println("Lista 2: ");
        lista2.imprimeListaInicio();

        lista.concat(lista2);

        System.out.println("--------------------------");
        System.out.println("Lista Completa: ");
        lista.imprimeListaInicio();

    }
}