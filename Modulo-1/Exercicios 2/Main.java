import java.util.Arrays;
import java.util.Scanner;


// Vetor para Alunos
class VetorAlunos {
    private Aluno[] elementos;
    private int tamanho;

    public VetorAlunos(int capacidade) {
        this.elementos = new Aluno[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Aluno aluno) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = aluno;
            this.tamanho++;
        } else {
            System.out.println("Capacidade máxima do vetor atingida.");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "VetorAlunos{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de alunos a serem cadastrados:");
        int numAlunos = scanner.nextInt();

        VetorAlunos vetor = new VetorAlunos(numAlunos);

        for (int i = 0; i < numAlunos; i++) {
            scanner.nextLine(); // Limpa o buffer
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do aluno " + (i + 1) + ":");
            int idade = scanner.nextInt();

            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            double nota = scanner.nextDouble();

            Aluno aluno = new Aluno(nome, idade, nota);
            vetor.adiciona(aluno);
        }

        scanner.close();

        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        System.out.println(vetor);
    }
}