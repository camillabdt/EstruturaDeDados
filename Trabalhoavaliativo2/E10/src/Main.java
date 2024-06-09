import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Recursao recursao = new Recursao();
        System.out.println("Recursão:");
        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();

        recursao.mostrarSoma(num);

    }
}
