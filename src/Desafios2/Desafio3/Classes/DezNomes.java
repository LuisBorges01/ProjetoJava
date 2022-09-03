package Desafios2.Desafio3.Classes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DezNomes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomes = " ";
        String todosNomes = "\n";
        while(nomes != null){
        System.out.println("=== Digite o nome dos alunos do 2º ano: ===");
        nomes = in.nextLine();
        if(nomes.length() > 10){
            todosNomes = todosNomes + "\n " +nomes;
            System.out.println("Alunos com mais de 10 letras no nome:" + todosNomes + " ");
        }
     }
    }
}
