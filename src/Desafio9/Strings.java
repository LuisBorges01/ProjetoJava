package Desafio9;

public class Strings {
    public static void main(String[] args){
        String palavra = "Luis Eduardo Bonito";
        
        
        System.out.println("----endsWith / startsWith----");
        System.out.println(palavra.endsWith("Charmoso"));   
        System.out.println(palavra.startsWith("u"));
        System.out.print(palavra.startsWith("i", 2));
        
        System.out.println("----toCharArray----");
        for(char p: palavra.toCharArray()){
                System.out.println("Letra: " + p);    
        }
        
        String palavraVazia = "";
        System.out.println("----isEmpty----");
        System.out.println(palavraVazia.isEmpty());

        System.out.println("----substring e subSequence----");
        System.out.println(palavra.substring(0, 5));

        System.out.println("----format----");
        String formatada=String.format( "O valor formatado é %f" , 32.33434 );  
        System.out.println(formatada);

        System.out.println("----ValueOf----");
        int myInt = 9;
        System.out.println("Valor transformado de INT " + String.valueOf(myInt));

    }
    
}
