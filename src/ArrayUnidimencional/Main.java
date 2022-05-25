package ArrayUnidimencional;

public class Main {

    public static void main(String[] args){
        int[] numeros = new int[5];  //Aqui declaramos el arreglo ESTE --> Tipo entero de 5 valores

        //int[] numeros = {10,20,20}; Aqui lo declaramos con valores ya definidos


        //Aqui asigno valor posicion por posicion
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for(int i = 0;i<5;i++){
            System.out.println("Valor en array: " + numeros[i]);
        }



    }

}
