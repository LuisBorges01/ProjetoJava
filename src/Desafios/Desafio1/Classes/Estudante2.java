package Desafios.Desafio1.Classes;

import java.util.Scanner;

public class Estudante2 {
    /*
Faça um algoritmo que:
- Leia um número indeterminado de linhas contendo cada uma os dados dos alunos.
- A última linha, que não entrará nos cálculos, contém série igual a zero (0).
- Calcule e escreva:
- A quantidade de alunos que está na primeira série;
- A média da quantidade de livros lidos por um aluno que estão na segunda série;
- A porcentagem de alunos que estão na terceira série e não leram livros no ano.
     */

     Scanner inScanner = new Scanner(System.in);
     public int serie;
     public int  quantidadeLivros;
     public int  quantidadeLivros3;
     public int numberStudent1;
     public int numberStudent;
     public int naoLeram;
     public int media;

     public void print(){
        int cont = 0;
        cont ++;
        while(cont < 3){
        System.out.println("Declare a série: ");
        serie = inScanner.nextInt();
        //"---------------------------------"
       if(serie == 1){
        System.out.println("Quantos alunos há na sua sala? ");
        numberStudent1 = inScanner.nextInt();
       }else{
       //"---------------------------------"
        System.out.println("Quantos alunos há na sua sala? ");
        numberStudent = inScanner.nextInt();
       }
       if(serie <= 2) {
        System.out.println("Line 41");
        System.out.println("Quantos livros leu? ");
        quantidadeLivros = inScanner.nextInt();
        //Exec 1
       if(serie == 1){
        System.out.println("Exec 1");
        System.out.println(numberStudent1);
       }
        ////Exec 2; 
        //calcula a média
       if(serie == 2){
        System.out.println("Exec 2");
        this.media = (numberStudent) / quantidadeLivros;
        System.out.println("A média da segunda série é: " + media);
       }
        break;


        }
        if(serie == 3 || serie < 0){
            System.out.println("Line 47");
            System.out.println("Quantos livros leu? ");
            quantidadeLivros3 = inScanner.nextInt();
        }else if(this.quantidadeLivros3 == 0){
            quantidadeLivros3 = naoLeram;
            //System.out.println("Você não é um bom aluno.");
            break;
        }
        if(serie == 3){
            int quantidade;
            System.out.println("A quantidade é: " + this.naoLeram);
            quantidade = this.numberStudent / naoLeram;
            System.out.println(quantidade);
            }



    }
    
 }
}    

      



 
    
     



    

