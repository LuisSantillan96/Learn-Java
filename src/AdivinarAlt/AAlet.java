package AdivinarAlt;

import java.util.Scanner;

public class AAlet {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int random = (int)( Math.random()*100);
        System.out.println("*** ADIVINA EL NUMERO ***");
        System.out.println(random);

        do{
            System.out.print("Que numero crees que es: ");
            numero = entrada.nextInt();

            if(numero > random){
                System.out.println("Un poco menos.");
            }else if(numero < random){
                System.out.println("Un poco mas.");
            }

        }while(random != numero);

        System.out.println("Felicidades lo adivinaste!!!");


    }

}
