package Metodos1;

public class CalculadoraTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //calculadora.somaDoisNum();
        //calculadora.subtraiDoisNum9();
        //calculadora.multiplicaDoisNumero(5,5);
        double resultado = calculadora.divisaoDoisNumeros(10d, 5);
        calculadora.multiplicaDoisNumero(resultado, 5);
    }
    
}
