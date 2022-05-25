package Amigos;

import java.util.Scanner;

public class Amigos {

    public static void main(String[] args){
        Scanner cantidad = new Scanner(System.in);
        double guillermo;
        double suma;

        System.out.println("Ingresa la antidad que tiene Guillermo: ");
        guillermo = cantidad.nextDouble();

        double luis = guillermo/2;
        double juan = (guillermo + luis)/2;
        suma = guillermo + luis + juan;

        System.out.println("Si Guillermo tiene: " + guillermo);
        System.out.println("Luis tiene: " + luis);
        System.out.println("Y Juan tiene: " + juan);
        System.out.println("Y Jentre todos tienen: " + suma);



    }

}
