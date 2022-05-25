package ArrayUnidimencional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int first = 0;
        int last = 9;

        int[] arreglo = new int[10];


        for(int i=0;i<10;i++){
            System.out.print("Intriduce el valor para la posicion " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }



        for(int j=0;j<5;j++){
            System.out.println("Posicion: " + first + "Valor" + arreglo[first]);
            System.out.println("Posicion: " + last + "Valor" + arreglo[last]);
            first += 1;
            last -= 1;
        }



    }
}
