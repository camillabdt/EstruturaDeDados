public class Recursao {
    public int soma(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero + soma(numero - 1);
        }
    }

    public void mostrarSoma(int numero) {
        int resultadoSoma = soma(numero);
        System.out.println("A soma dos números de 1 até " + numero + " é: " + resultadoSoma);
    }
}