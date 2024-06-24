public class Main {
    public static void main(String[] args) {
        ABB arvore = new ABB();

        // Inserir elementos na árvore
        arvore.recursiveAdd(59);
        arvore.recursiveAdd(12);
        arvore.recursiveAdd(68);
        arvore.recursiveAdd(3);
        arvore.recursiveAdd(58);
        arvore.recursiveAdd(49);
        arvore.recursiveAdd(60);
        arvore.recursiveAdd(66);
        arvore.recursiveAdd(89);
        arvore.recursiveAdd(80);

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
