package PosQuarenta.F.QuarentaDois;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    

    public void print(){
        System.out.println("------------------------------------");
        System.out.println("NOME: " + getNome());
        System.out.println("LIMITE VELOCIDADE " + getVeloidadeLimite());
        System.out.println("VELOCIDADE MÁXIMA " + getvelocidadeMaxima());
    }


    public void setNome(String nm){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setvelocidaMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getvelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
       Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVeloidadeLimite(){
       return velocidadeLimite;
    }

}
