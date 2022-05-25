package OrdenamientoInsercion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int arreglo[], nElementos, pos, aux;

        System.out.print("De cuantos valores ocupas el arreglo:");
        nElementos = entrada.nextInt();
        arreglo = new int[nElementos];

        arreglo = new int[nElementos];

        for(int i=0;i<nElementos;i++){
            System.out.print("Inserta el valor en la posicion " + i +  " :");
            arreglo[i] = entrada.nextInt();
        }

        //ORDENAMIENTO POR INSERCION
        for(int i=0;i<nElementos;i++){
            pos = i;
            aux = arreglo[i];

            while((pos>0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;

        }

        System.out.println("Oredenado");
        for(int x=0;x<nElementos;x++){
            System.out.println(x + " --> " + arreglo[x]);
        }


    }
}
