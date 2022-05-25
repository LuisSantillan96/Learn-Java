package ArrayUnidimencional;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[5];
        //Sumar a cero
        int sumaCero = 0;

        //Scara media de positivos
        int sumaPositivos = 0;
        int positivosArreglo = 0;

        //Scara media de negativos
        int sumaNegativos = 0;
        int negativosArreglo = 0;

        //Aqui introducimos valores al arreglo
        for(int i=0;i<5;i++){
            System.out.print("Intriduce el valor para la posicion " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }

        //Aqui vamos a hacer lo que necesitamos
        for(int j=0;j<5;j++){
            //Contamos cuantos ceros hay en el arreglo
            if(arreglo[j] == 0){
                sumaCero += 1;
            }

            //Media de numeros positivos
            if(arreglo[j] > 0){
                positivosArreglo += 1;
                sumaPositivos += arreglo[j];
            }

            //Media de numeros negativos
            if(arreglo[j] < 0){
                negativosArreglo += 1;
                sumaNegativos += arreglo[j];
            }

        }


        System.out.println("Media numeros positivos: " + sumaPositivos/positivosArreglo);
        System.out.println("Media numeros negativos: " + sumaNegativos/negativosArreglo);
        System.out.println("0's en el arreglo: " + sumaCero);




    }

}
