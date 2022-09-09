package Depois.Jmodificadorfinal.ModificadorFinal;

public class Comprador {
    private String nome;

    //ovverider
    public String toString(){
        return this.nome;  
      }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
