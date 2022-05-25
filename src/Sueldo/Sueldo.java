package Sueldo;

import java.util.Scanner;

public class Sueldo {

    public static void main(String[] args){
        Scanner horas = new Scanner(System.in);
        float salarioPorHora = 20;
        float horasTrabajadas;
        float pagoTotal;

        System.out.print("Ingresa cuantas horas trabajaste esta semana: ");
        horasTrabajadas = horas.nextFloat();
        pagoTotal = horasTrabajadas * salarioPorHora;
        System.out.println("Tu salario de esta semana es de " + pagoTotal);





    }

}
