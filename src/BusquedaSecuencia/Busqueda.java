package BusquedaSecuencia;

import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args){

        int[] numeros = {1,5,2,9,2};
        int dato;

        System.out.println("Que dato quieres buscar? ");
        Scanner entrada = new Scanner(System.in);
        dato = entrada.nextInt();

        //BUSQUEDA SECUENCIAL
        int i=0;
        boolean band = false;

        while(i<5 && band == false){
            if(numeros[i] == dato){
                band = true;
            }
            i++;
        }

        if(band == false){
            System.out.println("No se encontro en el arreglo!");
        }else{
            System.out.println("El valor que buscas si se encuentra en la posicion" + numeros[i]);
        }

    }
}
