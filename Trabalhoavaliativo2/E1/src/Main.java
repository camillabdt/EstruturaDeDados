public class Main {

    public static void main(String[] args) {
        Vetor numeros1 = new Vetor(10);
        Vetor numeros2 = new Vetor(10);
        numeros1.gerandoAleatorio();
        numeros2.gerandoAleatorio();
        numeros1.imprime();
        System.out.println("------------------");
        numeros2.imprime();

        System.out.println(numeros1.getIntersecao(numeros2));
    }


}