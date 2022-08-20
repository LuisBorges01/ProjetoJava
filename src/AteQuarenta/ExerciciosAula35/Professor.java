package ExerciciosAula35;

public class Professor {
    public String nome;
    public int idade;
    public double[] notas;
    
    public void imprime(Professor aux){
      System.out.println("NOME: " + aux.nome);
      System.out.println("IDADE: " + aux.idade);
      for(double nota : notas){ 
      System.out.println("SUAS NOTAS: "  + nota);
     }
    }
   
    
     public void tirarMedia(){
     for(double nota : notas){
        double media = 0;
         media += nota;
         media = media /notas.length;
         
        if(media < 6){
        System.out.println("A média é " + media + "então: Aprovado!");
      }
     }
        System.out.println("Reprovado!");
    }
}    

    
    

