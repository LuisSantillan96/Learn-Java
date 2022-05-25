package ArrayUnidimencional;

import javax.swing.*;

public class Ejemplo {

    public static void main(String[] args){
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos necestias"));

        char[] caracteres = new char[nElementos];

        for(int i=0;i<nElementos;i++){
            caracteres[i] = JOptionPane.showInputDialog("Ingresa el carcater: ").charAt(0);
        };

        for(int i=0;i<nElementos;i++){
            System.out.println(caracteres[i]);
        };

    }

}
