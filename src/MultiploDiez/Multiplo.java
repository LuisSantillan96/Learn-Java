package MultiploDiez;

import javax.swing.*;
import java.util.Scanner;

public class Multiplo {

    public static void main(String[] args){
        int numero;
        double div;


        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a validar:"));

        if (numero%10 == 0){
            JOptionPane.showMessageDialog(null,"SI es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null,"NO es multiplo de 10");
        }



    }

}
