public class Pedido {
    private double peso;
    private double distanciaDeEntrega;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDistanciaDeEntrega() {
        return distanciaDeEntrega;
    }

    public void setDistanciaDeEntrega(double distanciaDeEntrega) {
        this.distanciaDeEntrega = distanciaDeEntrega;
    }

    public double calcularFrete() {
        return Correio.calcularFrete(this.peso, this.distanciaDeEntrega);
    }
}
