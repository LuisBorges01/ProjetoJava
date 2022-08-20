package New.Aula31.Test;

import java.util.Scanner;

public class ExercicioJhonata {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j; j > n; j++){
                a += b;
                b=b*2;
                System.out.println("   ");
                System.out.println(a);
                
            }
            System.out.println("/n");
        }
        in.close();
    }
    
    
}
