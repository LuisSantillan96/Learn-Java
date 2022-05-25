package Matriz;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la fila"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la fila"));

        matriz = new int[nFilas][nColumnas];

        System.out.println("Digite la matriz: ");

        for(int i=0;i<nFilas;i++){ //Numero de filas
            for(int j=0;j<nColumnas;j++){ //Numero de columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]= entrada.nextInt();
            }
        }

        System.out.println("Impresion de la matriz:");
        for(int i=0;i<nFilas;i++){ //Numero de filas
            for(int j=0;j<nColumnas;j++){ //Numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }

}
