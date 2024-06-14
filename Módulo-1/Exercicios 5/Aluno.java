public class Aluno {
    String nome;
    int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula;
    }
}
