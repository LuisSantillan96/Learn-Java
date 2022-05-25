package Matriz;

import java.util.Scanner;

public class SumaMatriz {

    public  static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;


        System.out.print("Ingresa el numero de Filas: ");
        nFilas = entrada.nextInt();

        System.out.print("Ingresa el numero de Columnas: ");
        nColumnas = entrada.nextInt();

        matriz = new int[nFilas][nColumnas];

        System.out.println("Ingresa los valores de la matriz");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColumnas;j++){
                System.out.print("Ingresa el valor para la posicion ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Impresion de la matriz:");
        for(int i=0;i<nFilas;i++){ //Numero de filas
            for(int j=0;j<nColumnas;j++){ //Numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }


        //Suma de fila y colunma
        //FIlas
        int sumaFilas;
        for(int i=0;i<nFilas;i++){
            sumaFilas = 0;
            for(int j=0;j<nColumnas;j++){
                sumaFilas += matriz[i][j];
            }
            System.out.println("Las suma de la fila ["+i+"] es:" + sumaFilas);
        }
        System.out.println("");

        //sumascolumnas
        int sumaColumnas;
        for(int i=0;i<nColumnas;i++){
            sumaColumnas = 0;
            for(int j=0;j<nFilas;j++){
                sumaColumnas += matriz[i][j];
            }
            System.out.println("Las suma de la coulmna ["+i+"] es:" + sumaColumnas);
        }
        System.out.println("");
    }
}
