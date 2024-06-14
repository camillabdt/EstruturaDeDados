public class OrdenacaoSelecao {

    public static void ordenacaoSelecao(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontra o menor elemento na parte não ordenada
            int menorIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[menorIndice]) {
                    menorIndice = j;
                }
            }
            // Troca o menor elemento com o primeiro elemento da parte não ordenada
            int temp = array[menorIndice];
            array[menorIndice] = array[i];
            array[i] = temp;
        }
    }
}
