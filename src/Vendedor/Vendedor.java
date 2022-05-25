package Vendedor;

import java.util.Scanner;

public class Vendedor {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float salario = 1000f;
        float venta;
        float salarioTotal;
        float carros;

        System.out.print("Cunatos vehiculos vendio este mes: ");
        venta = entrada.nextFloat();
        venta *= 150;
        System.out.print("Cunatos fue de la venta total de los carros: ");
        carros = entrada.nextFloat();
        carros *= .05;

        salarioTotal = salario + venta + carros;

        System.out.println("Su salario de este mes es de: " + salarioTotal);

    }

}
