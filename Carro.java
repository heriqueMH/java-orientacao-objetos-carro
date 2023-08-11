public class Carro extends Veiculo {
  private int numeroDePortas;
  private int cambio;
  private boolean automatico;

  public Carro(String fabricante, String modelo, String cor, Motor motor, int numeroDePortas, int cambio, boolean automatico) {
      super(fabricante, modelo, cor, motor);
      this.numeroDePortas = numeroDePortas;
      this.cambio = cambio;
      this.automatico = automatico;
  }
  
  public int getNumeroDePortas() {
      return numeroDePortas;
  }
  
  public void setNumeroDePortas(int numeroDePortas) {
      this.numeroDePortas = numeroDePortas;
  }
  
  public int getCambio() {
      return cambio;
  }
  
  public void setCambio(int cambio) {
      this.cambio = cambio;
  }
  
  public boolean isAutomatico() {
      return automatico;
  }
  
  public void setAutomatico(boolean automatico) {
      this.automatico = automatico;
  }
}
