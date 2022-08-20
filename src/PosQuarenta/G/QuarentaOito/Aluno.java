package PosQuarenta.G.QuarentaOito;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    //CONST
    public Aluno (String nome, int idade){
     this.nome = nome;
     this.idade = idade;
    }
    public Aluno(){

    }
    //Met PRINT
    public void print(){
        System.out.println("================= Relatório do aluno =================");
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        if (this.seminario != null){
            System.out.println("SEMINARIO: " + this.seminario.getTitulo());
        }else{
            System.out.println("O aluno não está inscrito em nenhum seminário. ");
        }
    }
    //ARGS
    public void nome(String nome){
     this.nome=nome;
    }
    public String getNome(){
     return this.nome;
    }
 
    public void setIdade(int idade){
     this.idade=idade;
    }
    public int getIdade(){
     return this.idade;
    }
    //===================
    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }
    public Seminario getSeminario(){
        return this.seminario;
    }
    
}

/*if(seminario != null && seminario.leght){
 * System.out.println("Não foi possível executar.")
 * for(Seminario seminar : seminario){
         System.out.println(seminar.getTitulo() + " ");
      }
 * }
 */