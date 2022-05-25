package MetodoBurbuja;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        System.out.println("Cunatos elementos quieres en tu arreglo?");
        nElementos = entrada.nextInt();

        arreglo = new int[nElementos];
         for(int i=0;i<nElementos;i++){
             System.out.print("Inserta el valor en la posicion " + i +  " :");
             arreglo[i] = entrada.nextInt();
         }

         //METODO BURBUJA
        for(int i=0;i<(nElementos-1);i++){
            for(int j=0;j<(nElementos-1);j++){
                if(arreglo[j] > arreglo[j+1]){ //Actual es mayor a siguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;

                }
            }
        }

        System.out.println("Inmprimiendo arreglo ordenado");
        for(int x=0;x<nElementos;x++){
            System.out.println(x + " -->" + arreglo[x]);
        }

    }

}
