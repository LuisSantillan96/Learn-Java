package HorasADias;

import java.util.Scanner;

public class HorasADias {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int semana;
        int dia;
        int hora;
        int horasTotales;

        System.out.println("Ingresa la cantidad de horas: ");
        horasTotales = entrada.nextInt();

        semana = horasTotales / 168;
        dia = horasTotales%168 / 24;
        hora = horasTotales%24;




        System.out.println("Semanas :" + semana);
        System.out.println("Dias :" + dia);
        System.out.println("horas :" + hora);


    }
}
