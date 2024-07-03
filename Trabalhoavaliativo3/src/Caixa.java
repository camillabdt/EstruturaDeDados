public class Caixa {
    private Cliente clienteAtual;

    public void atenderCliente(Cliente cliente) {
        this.clienteAtual = cliente;
    }

    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    public void processarAtendimento() {
        if (clienteAtual != null) {
            clienteAtual.decrementarTempoDeAtendimento();
            if (clienteAtual.getTempoDeAtendimento() == 0) {
                clienteAtual = null; // Atendimento concluído
            }
        }
    }

    @Override
    public String toString() {
        if (clienteAtual != null) {
            return "Caixa atendendo: " + clienteAtual.toString();
        } else {
            return "Caixa livre";
        }
    }
}
