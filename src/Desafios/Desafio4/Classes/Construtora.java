package Desafios.Desafio4.Classes;

import java.util.Scanner;
import java.text.NumberFormat;

public class Construtora {
        public double metrosQuadrados;
        public double valorTinta;
        public double qtdMetrosQuadrados;
        public int i = 1;
        public double totalMetrosQuadrados;
        public double result;

    

    Scanner in = new Scanner(System.in);

    public void print(){
        System.out.println("Quantos metros² tem a casa " + i + "?");
        metrosQuadrados = in.nextDouble();
        this.totalMetrosQuadrados =  this.totalMetrosQuadrados + this.metrosQuadrados;
        System.out.println("Qual é o valor da tinta?");
        valorTinta = in.nextDouble();
        while(i<46){
            i++;
            System.out.println("Quantos metros² tem a casa " + i + "?");
            metrosQuadrados = in.nextDouble();
            this.totalMetrosQuadrados =  (this.totalMetrosQuadrados + this.metrosQuadrados);
        }
        double numeroLatas;
        numeroLatas = (this.totalMetrosQuadrados / 150);
        double resto;
        resto = (this.metrosQuadrados / 15);
        result = (numeroLatas * valorTinta);
        System.out.println("===RELATÓRIO===");
        String valorFormatado = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Para pintar as 47 casas, a empresa gastará: " + valorFormatado + " R$.");
        System.out.println("Sobrará " + resto + " litros de tinta.");
    }
}
/*
 * Uma construtora quer saber quanto vai gastar para pintar 47 casas, leia para cada casa a quantidade de metros quadrados e o valor da lata (ler somente uma vez o valor da lata), sabendo que:
    1 litro pinta 15m.
    1 lata tem 10 litros
     for(int i = 0; i < 47; i++){
            c   asas[i];
        }
            System.out.println("Para casa "+ casas[i]);
            System.out.println("\n Quantos metros quadrados tem a casa? ");
            metrosQuadrados = in.nextDouble();
            System.out.println("\n Qual é o valor da lata de tinta? ");
            valorTinta = in.nextInt();




int serie, qtlivros=0, qtserie1=0, qtserie2=0, qtlivroslidos2=0, qtnaoleram=0, qtserie3=0;
double media, perc;
serie=leiaInt("Digite a Série:");
qtlivros=leiaInt("Digite a quantidade de livros:");
while (serie!=0)
{
if (serie==1)
{
qtserie1=qtserie1+1;
}
if(serie==2 && qtlivros>0)
{
qtlivroslidos2=qtlivros+qtlivroslidos2;
qtserie2=qtserie2+1;
}
if (serie==3)
{
qtserie3=qtserie3+1;
}
if (serie==3 && qtlivros==0)
{
qtnaoleram=qtnaoleram+1;
}
serie=leiaInt("Digite a Série:");
qtlivros=leiaInt("Digite a quantidade de livros:");
}
media=(double) qtlivroslidos2/qtserie2;
perc=(double)(qtnaoleram*100)/qtserie3;
imprima("Quantidade de alunos da primeira serie:"+ qtserie1);
imprima("Media:" + media);
imprima("Porcentagem:" + perc);
}

 */