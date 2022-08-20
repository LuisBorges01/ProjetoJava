package PosQuarenta.QuarentaUm;

import PosQuarenta.F.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente client = new Cliente();
        System.out.println("Exibindo a quantidade de parcelas possíveis:");
        for(int parcela : client.getParcelas()){
            System.out.println(parcela);
        }
    }
        
}
