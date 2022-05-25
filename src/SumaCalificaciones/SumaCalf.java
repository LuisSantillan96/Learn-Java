package SumaCalificaciones;

import java.util.Scanner;

public class SumaCalf {

    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        float calf1;
        float calf2;
        float calf3;

        System.out.println("Ingresa la primera calificacion: ");
        calf1 = numero.nextFloat();
        System.out.println("Ingresa la segunda calificacion: ");
        calf2 = numero.nextFloat();
        System.out.println("Ingresa la tercera calificacion: ");
        calf3 = numero.nextFloat();

        float calFinal = (calf1 + calf2 + calf3) / 3;
        System.out.println("La suma de las calificaciones es: " + calFinal);

    }

}
