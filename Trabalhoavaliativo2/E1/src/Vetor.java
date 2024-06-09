import java.util.Random;

public class Vetor {

    Random random = new Random();
    private int[] vetor;
    private int total;

    public Vetor(int tamanho){
        this.vetor = new int[tamanho];
    }


    public Vetor(){
        vetor = new int[10];
    }


    public void adiciona(int numero){
        this.garanteEspaco();
        this.vetor[total] = numero;
        total++;
    }


    public int tamanho(){
        return total;
    }


    public boolean contem(int vetor){
        for(int i=0; i<this.total; i++){
            if(vetor == this.vetor[i]){
                return true;
            }
        }
        return false;
    }


    public boolean cheio(){
        if (total == this.vetor.length)
            return true;
        return false;
    }


    private void garanteEspaco(){
        if (this.cheio()){
            int[] novos = new int[this.vetor.length * 2];
            for (int i=0; i < this.vetor.length; i++)
                novos[i] = this.vetor[i];
            this.vetor = novos;
        }

    }


    public void gerandoAleatorio(){
        for (int i = 0; i < vetor.length; i++) {
            adiciona(random.nextInt(100));
        }
    }


    public void imprime(){
        for(int i=0; i < total; i++){
            System.out.println(vetor[i]);
        }
    }


    public String getIntersecao(Vetor vetor2){
        String intersecao = "";
        for(int i=0; i < total; i++){
            for(int j=0; j < vetor2.tamanho(); j++){
                if(vetor[i] == vetor2.vetor[j]){
                    intersecao += vetor[i] + " ";
                }
            }
        }
        return "Em comum: " + intersecao ;
    }


}