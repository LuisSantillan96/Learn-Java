package PlazaDescuento;

import javax.swing.*;

public class Descuento {

    public static void main(String[] args){
        double compra;

        compra = Double.parseDouble(JOptionPane.showInputDialog("Cual es el valor de tu compra: "));

        if(compra >= 300){
            compra = compra-(compra*.30);
            JOptionPane.showMessageDialog(null,"Tu compra ha quedado en: $" + compra);
        }else{
            JOptionPane.showMessageDialog(null,"Descuentos apartir de $300 o mas!!");
        }

    }

}
