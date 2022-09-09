package Depois.Jmodificadorfinal.ModificadorFinal;

public class Carro {
    public static final double VELOCIDADE_FINAL = 250;
    private final Comprador buyer = new Comprador();
    private String nome;
    private String marca;

//@override
   
    public String toString(){
        return "Carro: " + this.nome + "Marca: " + this.marca;
    }
    
//get set
    public Comprador getBuyer(){
        return buyer;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    
}
