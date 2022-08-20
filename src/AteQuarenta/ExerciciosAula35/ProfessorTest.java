package ExerciciosAula35;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
            professor.nome = "Luis";
            professor.idade = 30;
            professor.notas = new double[] {7.0,  9.8,  3.1};
            /*System.out.println(professor.nome);
            System.out.println(professor.idade);
            System.out.println(professor.notas);*/
            professor.imprime(professor);
            professor.tirarMedia();
 
        }


          
    }
    
    

