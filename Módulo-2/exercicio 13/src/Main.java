public class Main {
    public static void main(String[] args) {
        ABB arvore = new ABB();

        // Inserir elementos na árvore
        arvore.recursiveAdd(63);
        arvore.recursiveAdd(7);
        arvore.recursiveAdd(69);
        arvore.recursiveAdd(2);
        arvore.recursiveAdd(59);
        arvore.recursiveAdd(52);
        arvore.recursiveAdd(60);
        arvore.recursiveAdd(65);
        arvore.recursiveAdd(90);
        arvore.recursiveAdd(83);

        // Buscar elemento na árvore
        Noh resultado = arvore.busca(60);
        if (resultado != null) {
            System.out.println("Elemento 60 encontrado.");
        } else {
            System.out.println("Elemento 60 não encontrado.");
        }

        // Imprimir a árvore
        System.out.println("Impressão em Ordem:");
        arvore.imprimeEmOrdem();

        System.out.println("\nImpressão em Pré-Ordem:");
        arvore.imprimePreOrdem();

        System.out.println("\nImpressão em Pós-Ordem:");
        arvore.imprimePosOrdem();
    }
}
