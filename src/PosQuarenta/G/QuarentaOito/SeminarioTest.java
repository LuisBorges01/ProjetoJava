package PosQuarenta.G.QuarentaOito;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Luis ", 16);
        Aluno aluno2 = new Aluno("José ", 32);
        Aluno aluno3 = new Aluno("Cleyton ", 32);

        Seminario seminario = new Seminario("Como ser um programador JAVA");
        Seminario seminarioDois = new Seminario("Como ser um programador JAVA e ficar rico.");
        

        Professor professor = new Professor("Genigelsum", "Matemática");

      //  Professor professor2 = new Professor("Lorena", "Biologia");
        

        Local local = new Local("Pau Brasil ", "Águas Claras");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);


        seminario.setProfessor(professor);
       //seminario.setProfessor(professor2);
        seminario.setLocal(local);
        seminario.setAluno(new Aluno[] {aluno, aluno2, aluno3});  
        
        Seminario[] semArray = new Seminario[2];
        semArray[0] = seminario;
        professor.setSeminario(semArray);
        //professor2.setSeminario(semArray);


        seminario.print();
        professor.print();
       // professor2.print();
        aluno.print();
        aluno2.print();
        aluno3.print();
        local.print();  
    }
}
