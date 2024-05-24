public class PesquisaBinaria {

    public static int pesquisaBinariaIterativa(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] > valor) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1; // Elemento não encontrado
    }

    public static int pesquisaBinariaRecursiva(int[] vetor, int valor, int inicio, int fim) {
        if (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] > valor) {
                return pesquisaBinariaRecursiva(vetor, valor, inicio, meio - 1);
            } else {
                return pesquisaBinariaRecursiva(vetor, valor, meio + 1, fim);
            }
        }
        return -1; // Elemento não encontrado
    }
}
