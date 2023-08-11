public class Motor {
  private int numeroDeCilindros;
  private int cilindradas;
  private String combustivel;
  private int potencia;
  private boolean turbo;
  
  public Motor(int numeroDeCilindros, int cilindradas, String combustivel, int potencia) {
      this.numeroDeCilindros = numeroDeCilindros;
      this.cilindradas = cilindradas;
      this.combustivel = combustivel;
      this.potencia = potencia;
  }
  
  public int getNumeroDeCilindros() {
      return numeroDeCilindros;
  }
  
  public void setNumeroDeCilindros(int numeroDeCilindros) {
      this.numeroDeCilindros = numeroDeCilindros;
  }
  
  public int getCilindradas() {
      return cilindradas;
  }
  
  public void setCilindradas(int cilindradas) {
      this.cilindradas = cilindradas;
  }
  
  public String getCombustivel() {
      return combustivel;
  }
  
  public void setCombustivel(String combustivel) {
      this.combustivel = combustivel;
  }
  
  public int getPotencia() {
      return potencia;
  }
  
  public void setPotencia(int potencia) {
      this.potencia = potencia;
  }
  
  public boolean isTurbo() {
      return turbo;
  }
  
  public void setTurbo(boolean turbo) {
      this.turbo = turbo;
  }

public String getNumCilindro() {
    return null;
}
}
