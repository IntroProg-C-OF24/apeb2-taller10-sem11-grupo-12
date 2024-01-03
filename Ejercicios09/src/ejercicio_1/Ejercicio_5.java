import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int filasA, columnasA, filasB, columnasB;
        System.out.print("Ingrese el número de filas de la matriz A: ");
        filasA = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz A: ");
        columnasA = scanner.nextInt();
        int[][] matrizA = new int[filasA][columnasA];
        System.out.print("Ingrese el número de filas de la matriz B: ");
        filasB = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz B: ");
        columnasB = scanner.nextInt();
        int[][] matrizB = new int[filasB][columnasB];
        int[][] resultado = new int[filasA][columnasB];
        if (columnasA != filasB) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de A debe ser igual al número de filas de B.");
        } else {
            System.out.println("Matriz A:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizA[i][j] = (int) (Math.random() * 19 - 9);
                    System.out.print(matrizA[i][j] + "  | ");
                }
                System.out.println();
            }
            System.out.println("Matriz B:");
            for (int i = 0; i < filasB; i++) {
                for (int j = 0; j < columnasB; j++) {
                    matrizB[i][j] = (int) (Math.random() * 19 - 9);
                    System.out.print(matrizB[i][j] + "  | ");
                }
                System.out.println();
            }
            System.out.println("Resultado de la multiplicación:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    resultado[i][j] = 0;
                    for (int k = 0; k < columnasA; k++) {
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                    System.out.print(resultado[i][j] + "  | ");
                }
                System.out.println();
            }
        }
    }
}
