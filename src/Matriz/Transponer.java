package Matriz;

import java.util.Scanner;

public class Transponer {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas = 3, nColumnas = 3;
        boolean simetrica = true;


        matriz = new int[nFilas][nColumnas];

        System.out.println("Ingresa los valores de la matriz");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColumnas;j++){
                System.out.print("Ingresa el valor para la posicion ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        //Original
        System.out.println("Impresion de la matriz original:");
        for(int i=0;i<nFilas;i++){ //Numero de filas
            for(int j=0;j<nColumnas;j++){ //Numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        //Tranponerla
        int valor;
        for(int i=0;i<nFilas;i++){ //Numero de filas
            for(int j=0;j<i;j++){ //Numero de columnas
                valor = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = valor;
            }
        }

        //Transpuesta
        System.out.println("Impresion de la matriz transpuesta:");
        for(int i=0;i<nFilas;i++){ //Numero de filas
            for(int j=0;j<nColumnas;j++){ //Numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }


    }
}
