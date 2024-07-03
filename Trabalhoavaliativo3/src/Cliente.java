public class Cliente {
    private static int contador = 0; // Contador para gerar números sequenciais
    private int numero;
    private int tempoDeAtendimento;

    public Cliente(int tempoDeAtendimento) {
        this.numero = ++contador;
        this.tempoDeAtendimento = tempoDeAtendimento;
    }

    public int getNumero() {
        return numero;
    }

    public int getTempoDeAtendimento() {
        return tempoDeAtendimento;
    }

    public void decrementarTempoDeAtendimento() {
        if (tempoDeAtendimento > 0) {
            tempoDeAtendimento--;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", tempoDeAtendimento=" + tempoDeAtendimento + '}';
    }
}
