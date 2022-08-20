package Desafios.Desafio2.Classes;

public class SecretariaEducação {
    public String escolarural;
    public int quantidadeEscolas;
    public int distanciaCentro;
    public int numeroAlunos;
    public String estradasAsfaltadas;
    
    //
    public  SecretariaEducação(String escolarural, int distanciaCentro, String estradasAsfaltadas, int numeroAlunos, int quantidadeEscolas){
        this.escolarural = escolarural;
        this.distanciaCentro = distanciaCentro;
        this.estradasAsfaltadas = estradasAsfaltadas;
        this.numeroAlunos = numeroAlunos;
        this.quantidadeEscolas = quantidadeEscolas;
    }
    public SecretariaEducação(){
    }


    //
    public void quantidadeCarne(){  
        double quantidadeCarne;
        double carneAluno = 0.5;
        quantidadeCarne = (carneAluno * numeroAlunos);
        System.out.println("Quantidade de quilos de carne da escola semanalmente: " + quantidadeCarne + "KG.");
    }
    public void escolasDistantes(){
        if(distanciaCentro > 15){
            System.out.println("Essa escola fica a mais de 15km de distância");
        }
    }
    public void alunosTotais(){
        int alunosTotais;
        alunosTotais = numeroAlunos;
        System.out.println("Quantidade de alunos: " + alunosTotais);
    }
        //print
        public void print(){
            System.out.println(this.escolarural);
            System.out.println(this.estradasAsfaltadas);
            System.out.println(this.distanciaCentro);
            System.out.println(this.numeroAlunos);
            System.out.println(this.quantidadeEscolas);
            System.out.println("------------------------------------------------------");
            quantidadeCarne();
            escolasDistantes();
            alunosTotais();
            System.out.println("------------------------------------------------------");
        }

}
