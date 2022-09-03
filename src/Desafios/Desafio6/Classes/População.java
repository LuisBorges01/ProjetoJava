package Desafios.Desafio6.Classes;

public class População {
    public int A = 90000;
    public int B = 200000;
    public int ano = 0;
    
    public void crescimentoAnual(){
        while(A<=B){
            A += (A*0.03);
            B += (B*0.015);
            ano = ano + 1;
        }
        System.out.println("O país A ultrapassará o B em: " + ano + " anos.");
    }
    
}
