package Cero;

import java.util.Scanner;

public class Cero {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un numero a validar: ");
        numero = entrada.nextInt();

        while(numero != 0){
            if(numero > 0){
                System.out.println("--> " + numero + " es positivo");
                System.out.println("Ingresa otro numero a validar");
                numero = entrada.nextInt();
            }else{
                System.out.println("--> " + numero + " es negativo");
                System.out.println("Ingresa otro numero a validar");
                numero = entrada.nextInt();
            }
        }

        System.out.println("Fin del programa!!");
    }

}
