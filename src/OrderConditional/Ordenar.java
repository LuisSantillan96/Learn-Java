package OrderConditional;

import javax.swing.*;

public class Ordenar {

    public static void main(String[] args){
        int n1;
        int n2;
        int n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el Numero 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el Numero 2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el Numero 3: "));

        if(n1 > n2 && n1 > n3){
            if(n2 > n3){
                JOptionPane.showMessageDialog(null,"Orden = " + n1 + " " + n2 + " " + n3);
            }else{
                JOptionPane.showMessageDialog(null,"Orden = " + n1 + " " + n3 + " " + n2);
            }
        }else if(n2 > n1 && n2 > n3){
            if(n1 > n3){
                JOptionPane.showMessageDialog(null,"Orden = " + n2 + " " + n1 + " " + n3);
            }else{
                JOptionPane.showMessageDialog(null,"Orden = " + n2 + " " + n3 + " " + n1);
            }
        }else if(n3 > n2 && n3 > n1){
            if(n1 > n2){
                JOptionPane.showMessageDialog(null,"Orden = " + n3 + " " + n1 + " " + n2);
            }else{
                JOptionPane.showMessageDialog(null,"Orden = " + n3 + " " + n2 + " " + n1);
            }
        }

    }

}
