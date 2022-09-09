package Depois.Herança.Herança;

import Depois.Herança.Funcionario;

public class HerançaTest {
    public static void main(String[] args) {
        // Pessoa person = new Pessoa("Coronel Ferdinam");
        // person.setNome("Luis");
        // person.setCpf("210.1023.3012-01");

        Endereço district = new Endereço();
        // Endereço district2 = new Endereço();
        district.setRua("Pau Brasil");
        district.setBairro("Águas Claras");
        // district2.setRua("Capitão Hélio");
        // district2.setBairro("Setor Militar Urbano");

        // person.setEndereço(district);
        /// person.print();

        System.out.println("----- Herança -----");
        Funcionario employee = new Funcionario("Capitão Narigão");
        // employee.setNome("Doutor Gabriel");
        employee.setCpf("0212.0230.523.01");
        employee.setSalario(24000);
        // employee.setEndereço(district2);
        // employee.print();
        // employee.imprimeReciboPagamento();

    }
}
