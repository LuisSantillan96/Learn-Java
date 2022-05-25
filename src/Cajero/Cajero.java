package Cajero;

import javax.swing.*;

public class Cajero {

    public static void main(String[] args){
        double balance = 1000;
        double accion;

        JOptionPane.showMessageDialog(null,"Bienvenido al Cajero.");
        int caso = Integer.parseInt(JOptionPane.showInputDialog("1-Ingresar Retirar | 2-Ingresar"));

        switch(caso){
            case 1:
                accion = Double.parseDouble(JOptionPane.showInputDialog("Cunato quieres retirar?"));
                balance -= accion;
                JOptionPane.showMessageDialog(null,"Retiro de $" + accion + " Exitoso!");
                JOptionPane.showMessageDialog(null,"Tu saldo actual es de: $" + balance);
                break;
            case 2:
                accion = Double.parseDouble(JOptionPane.showInputDialog("Cunato quieres Ingresar?"));
                balance += accion;
                JOptionPane.showMessageDialog(null,"Has ingresado $" + accion + " con Exitoso!");
                JOptionPane.showMessageDialog(null,"Tu saldo actual es de: $" + balance);
                break;
        }


    }

}
