package Depois.Kenumeração.Test;

import Depois.Kenumeração.Classes.Cliente;
import Depois.Kenumeração.Classes.TipoCliente;

public class ClienteTest {
        public static void main(String[] args){
        Cliente client = new Cliente("Luis", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
         System.out.println(client);
         System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
         System.out.println(TipoCliente.PESSOA_FISICA.getId());
        }   
}
