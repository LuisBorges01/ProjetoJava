package Desafio15.Classes;

import java.sql.DataTruncation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period;
import java.time.Duration;

public class Idade {
    public static void main(String[] args){
        String data;

        Scanner in = new Scanner(System.in);
        System.out.println("DIGITE A SUA DATA DE NASCIMENTO: ");
        data = in.nextLine();

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        Period periodo = Period.between(LocalDate.parse(data,formatter), localDate);
        System.out.println("SUA IDADE É: " + periodo.getYears());
        Duration duration= Duration.between(LocalDate.parse(data, formatter), localDate);
        System.out.println("\nVocê vive há " + duration.toDays() + " dias.");
    }   
    
}
