public class Caminhao extends Veiculo {
  private double capacidadeDeCarga;
  private int qtdeEixos;

  public Caminhao(String fabricante, String modelo, String cor, Motor motor, double capacidadeDeCarga, int qtdeEixos) {
    super(fabricante, modelo, cor, motor);
    this.capacidadeDeCarga = capacidadeDeCarga;
    this.qtdeEixos = qtdeEixos;
  }

  public double getCapacidadeDeCarga() {
    return capacidadeDeCarga;
  }

  public void setCapacidadeDeCarga(double capacidadeDeCarga) {
    this.capacidadeDeCarga = capacidadeDeCarga;
  }

  public int getQtdeEixos() {
    return qtdeEixos;
  }

  public void setQtdeEixos(int qtdeEixos) {
    this.qtdeEixos = qtdeEixos;
  }
}

