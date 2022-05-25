package Entrada;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un numero: ");
        numero = entrada.nextInt();

        System.out.println("El numero que ingresaste es: " + numero);

    }

}
