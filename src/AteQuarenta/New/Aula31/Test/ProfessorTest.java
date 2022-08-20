package New.Aula31.Test;

import New.Aula31.Class.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
    Professor professor = new Professor();
    professor.cpf = "033.583.341-12";
    professor.nome = "Luis";
    professor.rg = "523.213-5";
    professor.matricula = 123;

    Professor professor2 = new Professor();
    professor2.cpf = "123.583.540-10";
    professor2.nome = "João";
    professor2.rg = "727.835-9";
    professor2.matricula = 413;

    //professor.imprime(professor);
    //System.out.println("-------------------------------");
    //professor.imprime(professor2);
    professor.imprime(professor2);

    }
}
