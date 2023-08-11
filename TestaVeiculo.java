public class TestaVeiculo {
  public static void main(String[] args) {

      Motor motorFerrari = 
        new Motor(8, 
        3588, 
        "Gasolina", 
        620);
        motorFerrari.setTurbo(true);
      
      Carro ferrari = 
        new Carro("Ferrari", 
        "Roma Spider", 
        "Vermelho", 
        motorFerrari, 
        2, 
        7, 
        true);
      
      exibir(ferrari);
      
      Motor motorCaminhao = 
        new Motor(
        6, 
        12000, 
        "Diesel", 
        400);
        motorCaminhao.setTurbo(true);
      
      Caminhao scania = 
      new Caminhao(
      "Scania", 
      "FNM", "Azul", 
      motorCaminhao, 
      40000.0, 
      3);
      
      exibir(scania);
  }
  
  public static void exibir(Veiculo veiculo) {
      System.out.println("Fabricante: " + veiculo.getFabricante());
      System.out.println("Modelo: " + veiculo.getModelo());
      System.out.println("Cor: " + veiculo.getCor());
      
      if (veiculo instanceof Carro) {
          Carro carro = (Carro) veiculo;
          System.out.println("Número de portas: " + carro.getNumeroDePortas());
          System.out.println("Câmbio: " + carro.getCambio());
          System.out.println("Automático: " + carro.isAutomatico());
      } else if (veiculo instanceof Caminhao) {
          Caminhao caminhao = (Caminhao) veiculo;
          System.out.println("Capacidade de carga: " + caminhao.getCapacidadeDeCarga());
          System.out.println("Quantidade de eixos: " + caminhao.getQtdeEixos());
      }
      
      Motor motor = veiculo.getMotor();
      System.out.println("Número de cilindros: " + motor.getNumeroDeCilindros());
      System.out.println("Cilindradas: " + motor.getCilindradas());
      System.out.println("Combustível: " + motor.getCombustivel());
      System.out.println("Potência: " + motor.getPotencia());
      System.out.println("Turbo: " + motor.isTurbo());
      
      System.out.println();
  }
}
