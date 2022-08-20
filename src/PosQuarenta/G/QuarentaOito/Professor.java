package PosQuarenta.G.QuarentaOito;

public class Professor {
   private String nome;
   private String especialidade;
   private Seminario[] seminario;



// const
   public Professor(String nome, String especialidade){
    this.nome = nome;
    this.especialidade = especialidade;
   }
   public Professor(){
   }

   //print
   public void print(){
      System.out.println("================= Relatório do Professor =================");
      System.out.println("Nome do Professor: " + this.nome);
      System.out.println("Especialidade: " + this.especialidade);
      System.out.print("Seminários Participantes: " );
      for(Seminario seminar : seminario){
         System.out.println(seminar.getTitulo() + " ");
      }

   }

   
   //args
   
   public void nome(String nome){
    this.nome=nome;
   }
   public String getNome(){
    return this.nome;
   }

   public void setEspecialidade(String especialidade){
    this.especialidade = especialidade;
   }
   public String getEspecialidade(){
    return this.especialidade;
   }
   public void setSeminario(Seminario[] seminario){
      this.seminario = seminario;
   }  
   public Seminario[] getSeminario(){
      return seminario;
   }
}
