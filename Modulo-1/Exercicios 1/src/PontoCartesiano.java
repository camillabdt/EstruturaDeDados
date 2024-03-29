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


}
