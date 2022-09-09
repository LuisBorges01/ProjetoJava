package Desafio10.Classes;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataSistema {
    public static void main(String[] args){

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(dataFormatada);
    }   
    
}
