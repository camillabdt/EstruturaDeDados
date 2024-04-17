import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String CSV_PATH = "categoria.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean rodando = true;
        while (rodando) {
            System.out.println("\nMenu de Gerenciamento de Categorias:");
            System.out.println("1. Adicionar categoria");
            System.out.println("2. Editar categoria");
            System.out.println("3. Excluir categoria");
            System.out.println("4. Listar categorias");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarCategoria(scanner, CSV_PATH);
                    break;
                case 2:
                    editarCategoria(scanner, CSV_PATH);
                    break;
                case 3:
                    excluirCategoria(scanner, CSV_PATH);
                    break;
                case 4:
                    listaCategoria.listarCategorias();
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
    private static ListaCategoria listaCategoria = new ListaCategoria();

    private static void adicionarCategoria(Scanner scanner, String filePath) {
        System.out.println("Digite o nome da categoria:");
        String nome = scanner.nextLine();
        System.out.println("Digite o identificador da categoria:");
        int identificador = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        Categoria categoria = new Categoria(nome, identificador);
        listaCategoria.adicionarCategoria(categoria, filePath); // Adiciona e salva no CSV
        System.out.println("Categoria adicionada com sucesso!");
    }
    private static void editarCategoria(Scanner scanner, String filePath) {
        System.out.println("Digite o identificador da categoria que deseja editar:");
        int identificador = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        Categoria categoria = listaCategoria.buscarPorIdentificador(identificador);
        if (categoria != null) {
            System.out.println("Digite o novo nome para a categoria " + categoria.getNome() + ":");
            String novoNome = scanner.nextLine();
            categoria.setNome(novoNome);
            listaCategoria.salvarCategoriasNoCSV(filePath); // Salva alterações no CSV
            System.out.println("Categoria atualizada com sucesso!");
        } else {
            System.out.println("Categoria não encontrada!");
        }
    }
    private static void excluirCategoria(Scanner scanner, String filePath) {
        System.out.println("Digite o identificador da categoria que deseja excluir:");
        int identificador = scanner.nextInt();
        if (listaCategoria.excluirCategoria(identificador, filePath)) {
            System.out.println("Categoria excluída com sucesso.");
        } else {
            System.out.println("Falha ao excluir categoria. Categoria não encontrada.");
        }
    }

    private static void carregarCategorias(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Pula a primeira linha (cabeçalho)
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");  // Mudança aqui para usar ponto e vírgula
                if (values.length == 2) {
                    int identificador = Integer.parseInt(values[0].trim());
                    String nome = values[1].trim();
                    Categoria categoria = new Categoria(nome, identificador);
                    listaCategoria.adicionarCategoria(categoria, filePath); // Adicionando o caminho do arquivo
                }
            }
            System.out.println("Categorias carregadas com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter identificador para número: " + e.getMessage());
        }
    }

}