package ejericiosbryan09;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int matriz1 [][]= new int [3][3];
        int matriz2 [][]= new int [3][3];
        int matrizResult [][]= new int [3][3];
        System.out.println("PRIMERA MATRIZ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) 
                matriz1[i][j]= (int)(Math.random()*(9-(-9)+1)+(-9));
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) 
                System.out.print("["+matriz1[i][j]+"]"+ "\t");
            System.out.println("");          
        }
        System.out.println("");
        System.out.println("SEGUNDA MATRIZ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) 
                matriz2[i][j]= (int)(Math.random()*(9-(-9)+1)+(-9));
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) 
                System.out.print("["+matriz2[i][j]+"]"+ "\t");
            System.out.println("");          
        }
        Scanner scanner= new Scanner(System.in);
        String productoIngre;
        System.out.println("¿QUE DESEA REALIZAR?");
        System.out.println("(1)Suma");
        System.out.println("(2)Resta");
        int opcion = scanner.nextInt();
        switch(opcion){
            case 1:
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz2.length; j++) 
                        matrizResult [i][j]= matriz1[i][j]+matriz2[i][j];
                }
                for (int i = 0; i < matrizResult.length; i++) {
                    for (int j = 0; j < matrizResult.length; j++)
                        System.out.print("["+matrizResult[i][j]+"]"+ "\t");
                    System.out.println("");              
                }
                break;
            case 2:
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz2.length; j++) 
                        matrizResult [i][j]= matriz1[i][j]-matriz2[i][j];
                }
                for (int i = 0; i < matrizResult.length; i++) {
                    for (int j = 0; j < matrizResult.length; j++)
                        System.out.print("["+matrizResult[i][j]+"]"+ "\t");
                    System.out.println("");                 
                }
                break;
        }    
           
    }
}

 /*PRIMERA MATRIZ
[-5]	[-7]	[1]	
[8]	[9]	[-4]	
[-8]	[-5]	[6]	

SEGUNDA MATRIZ
[-2]	[-2]	[0]	
[-8]	[-8]	[4]	
[-7]	[-2]	[4]	
¿QUE DESEA REALIZAR?
(1)Suma
(2)Resta

1
[-7]	[-9]	[1]	
[0]	[1]	[0]	
[-15]	[-7]	[10]	*/