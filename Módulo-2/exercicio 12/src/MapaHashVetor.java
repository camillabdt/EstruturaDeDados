public class MapaHashVetor {
    private Aluno[] vetor;

    public MapaHashVetor() {
        this.vetor = new Aluno[20]; // tamanho do vetor, pode ser ajustado
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                return;
            }
            sondagem++;
        }
        throw new RuntimeException("Tabela hash está cheia!");
    }

    public Aluno get(int chave) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] != null && vetor[hash].getMatricula() == chave) {
                return vetor[hash];
            }
            sondagem++;
        }
        return null;
    }

    public Aluno remove(int chave) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] != null && vetor[hash].getMatricula() == chave) {
                Aluno aluno = vetor[hash];
                vetor[hash] = null;
                return aluno;
            }
            sondagem++;
        }
        return null;
    }

    public static void main(String[] args) {
        MapaHashVetor mapa = new MapaHashVetor();

        Aluno aluno1 = new Aluno(736435217, "Bart");
        Aluno aluno2 = new Aluno(879995247, "Homer");
        Aluno aluno3 = new Aluno(524109227, "Lisa");
        Aluno aluno4 = new Aluno(996411117, "Meggie");

        mapa.put(aluno1.getMatricula(), aluno1);
        mapa.put(aluno2.getMatricula(), aluno2);
        mapa.put(aluno3.getMatricula(), aluno3);
        mapa.put(aluno4.getMatricula(), aluno4);

        System.out.println("Aluno com matrícula 736435217: " + mapa.get(736435217));
        System.out.println("Aluno com matrícula 879995247: " + mapa.get(879995247));
        System.out.println("Aluno com matrícula 524109227: " + mapa.get(524109227));
        System.out.println("Aluno com matrícula 996411117: " + mapa.get(996411117));

        System.out.println("Removendo aluno com matrícula 736435217: " + mapa.remove(736435217));
        System.out.println("Aluno com matrícula 736435217 após remoção: " + mapa.get(736435217));
    }
}
