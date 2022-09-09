package Depois.Jmodificadorfinal.ModificadorFinal;

public class ModificadorFinalTest {
    public static void main (String[] args) {
    Carro car = new Carro();
    Comprador buyer = new Comprador();
    buyer.setNome("Luis");
    System.out.println(Carro.VELOCIDADE_FINAL);
    System.out.println(car.getBuyer());

    System.out.println("__________________________");
    car.getBuyer().setNome("Bom Esponja");
    System.out.println(car.getBuyer());

    }
    
}
