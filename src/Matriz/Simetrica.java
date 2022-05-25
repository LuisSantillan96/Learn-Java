package Matriz;

import java.util.Scanner;

public class Simetrica {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;
        boolean simetrica = true;

        System.out.print("Cunatas filas quieres: ");
        nFilas = entrada.nextInt();
        System.out.print("Cunatas columnas quieres: ");
        nColumnas = entrada.nextInt();

        matriz = new int[nFilas][nColumnas];

        System.out.println("Ingresa los valores de la matriz");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColumnas;j++){
                System.out.print("Ingresa el valor para la posicion ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }


        if(nFilas == nColumnas){
            int i=0, j=0;
            while(i<nFilas && simetrica == true){
                while(j<i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica == true){
                System.out.println("La matriz SI es simetrica");
            }else{
                System.out.println("La matriz NO es simetrica!");
            }
        }else{
            System.out.println("La matriz NO es simetrica!");
        }
    }

}
