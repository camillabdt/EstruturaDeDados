public class VetorAlunos implements IVetorAluno {
    private double notas[] = new double[5];
    private int totalNotas = 0;

    public void adiciona(double nota) {
        this.notas[totalNotas] = nota;
        totalNotas++;
    }
    public int tamanho() {
        return totalNotas;
    }

    @Override
    public boolean contem(double nota) {
        for (int i = 0; i < this.totalNotas; i++) {
            if (this.notas[i] == nota) {
                return true;
            }
        }
        return false;
    }
}
