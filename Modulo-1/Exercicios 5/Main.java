public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        Aluno aluno1 = new Aluno("João", 123);
        Aluno aluno2 = new Aluno("Maria", 456);
        Aluno aluno3 = new Aluno("Pedro", 789);

        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        lista.adiciona(aluno3);

        System.out.println("Lista no sentido direto:");
        lista.imprimeSentidoDireto();

        System.out.println("\nLista no sentido reverso:");
        lista.imprimeSentidoReverso();

        lista.remove(aluno2);
        System.out.println("\nApós remover o aluno2:");
        lista.imprimeSentidoDireto();
    }
}
