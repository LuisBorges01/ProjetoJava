package AulaProfessor;
import AulaProfessor.Professor;

public class ProfessorTest {
public static void main(String[] args) {
    Professor professor = new Professor();
    professor.cpf = "033.583.341-12";
    professor.nome = "Luis";
    professor.rg = "523.213-5";
    professor.matricula = "123";

    Professor professor2 = new Professor();
    professor2.cpf = "033.583.341-12";
    professor2.nome = "Luis";
    professor2.rg = "523.213-5";
    professor2.matricula = "123";

    Professor professor3 = new Professor();
    professor3.cpf = "033.583.341-12";
    professor3.nome = "Luis";
    professor3.rg = "523.213-5";
    professor3.matricula = "123";
 
    Professor.imprime(professor);
    Professor.imprime(professor2);
    Professor.imprime(professor3);
 
}
}
