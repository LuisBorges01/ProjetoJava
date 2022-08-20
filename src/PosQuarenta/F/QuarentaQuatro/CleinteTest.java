package PosQuarenta.F.QuarentaQuatro;

public class CleinteTest {
    public static void main(String[] args) {
        Cliente client = new Cliente();
        System.out.println("Exibindo a quantidade de parcelas possíveis:");
        //for(int parcela : client.getParcelas()){
        //    System.out.print(parcela);
        //}
        System.out.println("Tamanho: " + client.getParcelas().length);

    }
    
}
