package ValidarMayus;

import javax.swing.*;

public class Mayus {

    public static void main(String[] args){
        char palabra;

        palabra = JOptionPane.showInputDialog("Ingresa un caracter:").charAt(0);

        if(Character.isUpperCase(palabra)){
            JOptionPane.showMessageDialog(null,"SI es mayuscula");
        }else{
            JOptionPane.showMessageDialog(null,"NO es mayuscula");
        }

    }
}
