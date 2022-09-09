public class ExercicioWhile {
    public static void main(String[] args) {
    int valorTotal =  30000;
    int parcela =  1; // 1 declaracao de variaveis
    while(parcela <= valorTotal){ // 2 - condicao
        parcela ++; // 3 -  incrementacao
        int valorParcela = valorTotal/parcela;
        if(valorParcela<1000){
            break;
        }
        String nome1 = "";
        String nome2 = "";
        if(nome1.equals(nome2)){
            
        }
        System.out.println("A parcela em "+ parcela +" vez fica: R$" + valorParcela);
    }
 }
}
