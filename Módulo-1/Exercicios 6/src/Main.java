public class Main {
    public static void main(String[] args) {
        IVetor meuVetor = new Vetor(1000);
        meuVetor.preencherAleatoriamente();

        long tempoInicioRecursivo = System.nanoTime();
        int maiorElementoRecursivo = ((Vetor)meuVetor).maximoRec();  // Agora usando o método interno que não precisa de índices
        long tempoFimRecursivo = System.nanoTime();
        double tempoExecucaoRecursivo = (tempoFimRecursivo - tempoInicioRecursivo) / 1_000_000.0;

        System.out.println("Maior elemento encontrado recursivamente: " + maiorElementoRecursivo);
        System.out.println("Tempo de execução (recursivo): " + tempoExecucaoRecursivo + " ms");

        long tempoInicioIterativo = System.nanoTime();
        int maiorElementoIterativo = meuVetor.maiorElementoIterativo();
        long tempoFimIterativo = System.nanoTime();
        double tempoExecucaoIterativo = (tempoFimIterativo - tempoInicioIterativo) / 1_000_000.0;

        System.out.println("Maior elemento encontrado iterativamente: " + maiorElementoIterativo);
        System.out.println("Tempo de execução (iterativo): " + tempoExecucaoIterativo + " ms");
    }
}
