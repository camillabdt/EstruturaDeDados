import java.util.Scanner;
import java.lang.Math;

public class PontoCartesiano {
    private double x;
    private double y;

    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

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

    public double calcularDistanciaEuclidiana(PontoCartesiano outroPonto) {
        double distancia = Math.sqrt(Math.pow((outroPonto.getX() - this.x), 2) + Math.pow((outroPonto.getY() - this.y), 2));
        return distancia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto 1 (x y):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        PontoCartesiano pontoUm = new PontoCartesiano(x1, y1);

        System.out.println("Digite as coordenadas do ponto 2 (x y):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        PontoCartesiano pontoDois = new PontoCartesiano(x2, y2);

        scanner.close();

        System.out.println("Coordenadas do ponto 1: (" + pontoUm.getX() + ", " + pontoUm.getY() + ")");
        System.out.println("Coordenadas do ponto 2: (" + pontoDois.getX() + ", " + pontoDois.getY() + ")");

        double distancia = pontoUm.calcularDistanciaEuclidiana(pontoDois);
        System.out.println("Distância euclidiana entre os pontos: " + distancia);
    }
}
