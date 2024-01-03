import java.util.Scanner
public class Ejercicio_7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int limMt;
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        limMt = scanner.nextInt();
        int[][] mt = new int[limMt][limMt];

        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                mt[i][j] = (int) (Math.random() * 19 - 9);
            }
        }
        System.out.println("Matriz Completa");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                System.out.print(mt[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("ELEMENTOS DE LA DIAGONAL SECUNDARIA");
        for (int i = 0; i < limMt; i++) {
            System.out.print(mt[i][(limMt - i) - 1] + " | ");
        }
        System.out.println();
        System.out.println("ELEMENTOS SOBRE LA DIAGONAL SECUNDARIA");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                if (j < (limMt - i) - 1) {
                    System.out.print(mt[i][j] + " | ");
                }
            }
        }
        System.out.println();
        System.out.println("ELEMENTOS DEBAJO DE LA DIAGONAL SECUNDARIA");
        for (int i = 0; i < limMt; i++) {
            for (int j = 0; j < limMt; j++) {
                if (j > (limMt - i) - 1) {
                    System.out.print(mt[i][j] + " | ");
                    
                }
            }
        }
        System.out.println("");
    }
}
