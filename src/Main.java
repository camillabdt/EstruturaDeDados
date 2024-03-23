import java.lang.Math;

public class PontoCartesiano {
    private double x;
    private double y;

    // Construtor
    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters e Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular a distância euclidiana entre dois pontos
    public double calcularDistanciaEuclidiana(PontoCartesiano outroPonto) {
        double distancia = Math.sqrt(Math.pow((outroPonto.getX() - this.x), 2) + Math.pow((outroPonto.getY() - this.y), 2));
        return distancia;
    }

    public static void main(String[] args) {
        // Testando o TAD em uma classe Main
        PontoCartesiano ponto1 = new PontoCartesiano(1, 2);
        PontoCartesiano ponto2 = new PontoCartesiano(4, 6);

        System.out.println("Coordenadas do ponto 1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        System.out.println("Coordenadas do ponto 2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");

        double distancia = ponto1.calcularDistanciaEuclidiana(ponto2);
        System.out.println("Distância euclidiana entre os pontos: " + distancia);
    }
}
