package EntradaSalidaGrafica;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        String palabra;
        int numero;
        char caracter;
        double doble;

        palabra = JOptionPane.showInputDialog("Ingresa una palabra:");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        caracter = JOptionPane.showInputDialog("Ingresa un caracter: ").charAt(0);
        doble = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero: "));

        JOptionPane.showMessageDialog(null,"La palabra es: " + palabra);
        JOptionPane.showMessageDialog(null,"El numero es: " + numero);
        JOptionPane.showMessageDialog(null,"El carcater es: " + caracter);
        JOptionPane.showMessageDialog(null,"El double es: " + doble);
    }

}
