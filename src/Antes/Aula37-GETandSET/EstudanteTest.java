package Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Luis");
        estudante.setIdade(16);
        //estudante.setNotas(new double[] {8.5,6.0,7.9});
        estudante.print();
        estudante.tirarMedia();
        System.out.println("Luis foi aprovaodo? " + estudante.getAprovado());
    }
    
}
