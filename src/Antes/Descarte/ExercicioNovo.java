import java.math.BigDecimal;

public class ExercicioNovo {
 public static void main(String[] args) {
      double valorTotal = 30000;
      for(int parcela = 1; parcela<=valorTotal; parcela++){
        double valorParcela = valorTotal / parcela;
        if(valorParcela<1000){
        break;
        }
        BigDecimal valorParcDecimal = BigDecimal.valueOf(valorParcela);
        System.out.println("A parcela em "+ parcela +" vez fica: R$" + valorParcDecimal.setScale(2, BigDecimal.ROUND_UP));
        /*System.out.println("A parcela em "+ parcela +" vez fica: R$" + valorParcela);
       }else {
        System.out.println("Acabou as possiblidades.");
       break;*/
   }
  }
 }  
 
