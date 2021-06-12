package com.mayson;

import javax.print.DocFlavor;

public class App {
    public static void main(String[] args) {
        exercicio1();
//        exercicio2();
    }
    private static void exercicio2(){

    }

    private static void exercicio1() {
        Double salarioPorHora = 2.75;
        Float horasPorDia = 8.5F;
        Integer diasPorMes = 30;
        Integer mesesPorAno = 11;
        Double decimoTerceiro = 0D;
        Double ferias = 0D;
        Double brutoAnual = 0D;

        Double salarioDia = salarioPorHora * horasPorDia;
        Double salarioMes = salarioDia * diasPorMes;
        String stringSalariodia = String.valueOf(salarioDia);
        String stringSalarioMes = String.valueOf(salarioMes);
        ferias = salarioMes * 1.3;
        decimoTerceiro = salarioMes;
        brutoAnual = ferias + decimoTerceiro;
        brutoAnual += salarioMes * mesesPorAno;
        //        brutoAnual = brutoAnual + (salarioMes * mesesPorAno);
        String stringBrutoAnual = String.valueOf(brutoAnual);

//        Console.printConsole(stringSalarioMes);
//        Console.printConsole(stringSalariodia);
//        Console.printConsole(stringBrutoAnual);


        StringBuilder sbText = new StringBuilder();
        sbText.append("Fulano recebe R$");
        sbText.append(salarioMes);
        sbText.append(" por mês");

        System.out.println(sbText);
        System.out.println("Fulano recebe R$" + salarioMes + " por mês");
        System.out.println("Renda bruta anual de fulano: R$" + brutoAnual + ".");


    }


//    {
//        String[] palavras = new String[10];
//        palavras[3] = "palavras";
//        palavras[2] = "letras";
//        System.out.println("Hello World");
//        String palav = palavras[2];
//        Console.printConsole(palavras[9],palav, palavras[2], "Ihoihiohioh" );
//    }
}
