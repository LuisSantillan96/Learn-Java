package Matriz;

public class Marco {
    public static void main(String[] args){
        int matriz[][] = new int[5][5];

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i == 0 || i == 4){
                    matriz[i][j] = 1;
                }else if(j == 0 || j == 4){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("Impresion:");
        for(int i=0;i<5;i++){ //Numero de filas
            for(int j=0;j<5;j++){ //Numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }
}
