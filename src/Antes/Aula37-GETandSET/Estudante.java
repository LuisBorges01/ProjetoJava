package Estudante;

public class Estudante {
    private String Nome;
    private int Idade;
    private double[] Notas;
    private boolean Aprovado;

    public void print(){
        System.out.println(this.Nome);
        System.out.println(this.Idade);
        if(this.Notas != null){
            for(double nota : this.Notas){
                System.out.println(nota);
            }
        }
    }
    
    public void tirarMedia(){
        if(this.Notas == null){
        System.out.println("This student do not have notes");
        return;
        } 
        double media = 0;
        for(double nota : this.Notas){
            media = nota/this.Notas.length;
        }
        if(media > 6){
            this.Aprovado = true;
            System.out.println("Aprovado!");
        }else{
            this.Aprovado = false;
            System.out.println("Reprovado!");
        }   
    }
//"---------------------------------------------------------"
        public void setNome(String name){
            this.Nome = name;
        }

        public void setIdade(int idade){
            this.Idade  = idade;
        }
        public void setNotas(double[] notas){
            this.Notas = notas;
        }
 //"---------------------------------------------------------"
        public int getIdade(){
            return this.Idade;
        }
        public String getNome(){
            return this.Nome;
        }
        public double[] getNotas(){
            return this.Notas;
        }

        public boolean getAprovado(){
            return this.Aprovado;
        }




}
