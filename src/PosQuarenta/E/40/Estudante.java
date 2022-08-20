package PosQuarenta.Quarenta;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatString;

    public Estudante(String nome, String matricula, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    public Estudante(String nome, String matricula, double[] notas, String dataMatriculaString){
        this();
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
        this.dataMatString = dataMatriculaString;
    }
    public Estudante(){
        System.out.println("Construtor default");
    }



    public void imprime(){
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for(double nota : notas){
        System.out.println(nota);
        }
        System.out.println(this.dataMatString);
    }

    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setNome(String nome){
        this.nome = matricula;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public double[] getNotas(){
        return this.notas;
    }


    
}
