package HorasExtra;

import javax.swing.*;

public class PagoHoras {

    public static void main(String[] args){
        int horas;
        double pagoTotal;

        //Si trabaja mas de 40 hrs. se pagan como  extra a partir de dichas
        // 1 a 40 hrs. $18
        // 40 en adelante hrs. $20
        horas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas estas semana: "));

        if(horas <= 40){
            pagoTotal = horas * 18;
            JOptionPane.showMessageDialog(null,"Pago total sin hrs. extra: $" + pagoTotal);


        }else{
            pagoTotal = ((horas - (horas - 40)) * 18) + ((horas - 40) * 20);
            JOptionPane.showMessageDialog(null,"Pago total con hrs. extra: $" + pagoTotal);
        }



    }

}
