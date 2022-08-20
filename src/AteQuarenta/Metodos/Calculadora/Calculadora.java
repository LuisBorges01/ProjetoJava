package Metodos.Calculadora;

public class Calculadora {
    public static void somaDoisNum(){
        System.out.println(5+5);
    }
    public static void subtraiDoisNum(){
        System.out.println(5-5);
    }
    public static void multiplicaDoisNum(int num1, int num2){
        System.out.println(num1*num2);
    }
//----------------------------------------
    public static double divideDoisNum(double num1, double num2){
        if (num2 != 0){
            return num1/num2;
        }
        return 0;
//"----------------------------------------"
    }
    public static  void imprimaDivisaoDoisNum(int num1, int num2){
        if(num2 != 0){
            System.out.println(num1/num2);
         return;
        }
        System.out.println("Não é possível dividir por zero.");
    }
//"-------------------------------------------------"
     public static void alteraDoisNumeros(int num1, int num2){
        num1 = 5;
        num2 = 85;
     }

    public static void somaNewArrays(int...numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num; 
            System.out.println(soma);
        }
        


    }



}

