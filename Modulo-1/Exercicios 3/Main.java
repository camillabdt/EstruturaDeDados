public class Main {

    public static void main(String[] args) {
        IVetorAluno vetAlunos = new VetorAlunos();
        vetAlunos.adiciona(9.0);
        vetAlunos.adiciona(5.2);

        System.out.println("Tamanho do vetor: " + vetAlunos.tamanho());
        System.out.println("Contém a nota 9.0? " + vetAlunos.contem(9.0));
        System.out.println("Contém a nota 5.5? " + vetAlunos.contem(5.5));
    }
}