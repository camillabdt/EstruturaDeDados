import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class ListaCategoria {
    private class Node {
        Categoria categoria;
        Node next;

        Node(Categoria categoria) {
            this.categoria = categoria;
            this.next = null;
        }
    }

    private Node head = null;

    public Categoria buscarPorIdentificador(int identificador) {
        Node current = head;
        while (current != null) {
            if (current.categoria.getIdentificador() == identificador) {
                return current.categoria;
            }
            current = current.next;
        }
        return null; // Categoria não encontrada
    }

    public boolean excluirCategoria(int identificador, String filePath) {
        Node current = head, prev = null;
        while (current != null && current.categoria.getIdentificador() != identificador) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return false; // Categoria não encontrada
        }
        if (prev == null) {
            head = head.next; // Exclui o primeiro nó se o nó a ser excluído for o head
        } else {
            prev.next = current.next; // Exclui nó que não é o primeiro
        }
        return true;
    }

    public void listarCategorias() {
        if (head == null) {
            System.out.println("Não há categorias cadastradas.");
            return;
        }
        System.out.println("Listando todas as categorias:");
        Node current = head;
        while (current != null) {
            System.out.println(current.categoria);
            current = current.next;
        }
    }

    public void adicionarCategoria(Categoria categoria, String filePath) {
        Node newNode = new Node(categoria);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        salvarCategoriasNoCSV(filePath);  // Salva automaticamente após adicionar
        System.out.println("Categoria adicionada e salva: " + categoria);
    }

    public void salvarCategoriasNoCSV(String filePath) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filePath, false))) {
            out.println("identificador;nome");  // Escreve o cabeçalho do CSV
            Node current = head;
            while (current != null) {
                out.println(current.categoria.getIdentificador() + ";" + current.categoria.getNome());
                current = current.next;
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }
    protected void finalize(String filePath) throws Throwable {
        super.finalize();
        salvarCategoriasNoCSV(filePath); // Salva as categorias antes de encerrar o programa
    }
}