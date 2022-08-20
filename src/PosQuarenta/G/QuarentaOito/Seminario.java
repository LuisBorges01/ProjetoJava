package PosQuarenta.G.QuarentaOito;

public class Seminario {
    private String titulo;
    private Aluno[] alunos; 
    private Professor professor;
    private Local local;

    //const
    public Seminario(String titulo){
        this.titulo = titulo;
    }
    public Seminario(){
    }
    //Met PRINT
    public void print(){
        System.out.println("================= Relatório do seminário =================");
        System.out.println("Título: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());
        System.out.print("Alunos participantes: ");
        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());

        }
        System.out.println("RUA: " + this.local.getRua() + "BAIRRO: " + this.local.getBairro());
        return;
    }

    //args
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public Professor getProfessor(){
        return professor;
    }
    public void setLocal(Local local){
        this.local = local;
    }
    public Local getLocal(){
        return local;
    }
    public void setAluno(Aluno[] alunos){
        this.alunos = alunos;
    }
    public Aluno[] getAlunos(){
        return alunos;
    }

}
