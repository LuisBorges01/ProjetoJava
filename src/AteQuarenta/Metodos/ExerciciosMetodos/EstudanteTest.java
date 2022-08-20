package Metodos.ExerciciosMetodos;

import java.util.Scanner;

public class EstudanteTest {
    public static void main(String[] args) {  

  Estudante estudante = new Estudante();
  estudante.nome = "João";
  estudante.idade = 12;

  Scanner notas = new Scanner(System.in);  
  System.out.println("Digite a nota 1: ");
  int valor1 = nextInt();
  System.out.println("Digite a nota 2: ");
  int valor2 = nextInt();
  System.out.println("Digite a nota 3: ");
  int valor3 =  nextInt();
  
  notas.close();
  
}    
}
