package AulaProfessor;

public class Professor {
    public String nome;
    public String  rg;
    public String cpf;
    public String matricula;


    public static void imprime(Professor profaux){
        System.out.println(profaux.nome);
        System.out.println(profaux.rg);
        System.out.println(profaux.cpf);
        System.out.println(profaux.matricula);
    }    
}
