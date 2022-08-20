package PosQuarenta.F.QuarentaDois;

public class StaticTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180.0);
        Carro c = new Carro("BMW", 295);
        Carro c1 = new Carro("Mercedes", 260);
        Carro c2 = new Carro("Punto Tjet", 220);

        c.print();
        c1.print();
        c2.print();

        Carro.velocidadeLimite = 200;
        
        System.out.println("============================================");
        c.print();
        c1.print();
        c2.print();


    }
}
