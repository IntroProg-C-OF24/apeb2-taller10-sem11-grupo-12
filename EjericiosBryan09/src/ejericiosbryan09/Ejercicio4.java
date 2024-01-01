package ejericiosbryan09;
import java.util.Scanner;
public class Ejercicio4 {
   public static void main(String[] args) {
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char jugadorActual = 'X';
        boolean juegoEnCurso = true;

        while (juegoEnCurso) {
            mostrarTablero(tablero);
            tomarMovimiento(tablero, jugadorActual);
            juegoEnCurso = !haGanado(tablero, jugadorActual) && !tableroLleno(tablero);
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }

        mostrarTablero(tablero);
        determinarGanador(tablero);
    }


    static void mostrarTablero(char[][] tablero) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }


    static void tomarMovimiento(char[][] tablero, char jugador) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        
        do {
            System.out.println("Jugador " + jugador + ", ingrese fila (0-2) y columna (0-2) separadas por espacio:");
            fila = scanner.nextInt();
            columna = scanner.nextInt();
        } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ');

        tablero[fila][columna] = jugador;
    }


    static boolean haGanado(char[][] tablero, char jugador) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }

        // Verificar diagonales
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
               (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }


    static void determinarGanador(char[][] tablero) {
        if (haGanado(tablero, 'X')) {
            System.out.println("¡Jugador X ha ganado!");
        } else if (haGanado(tablero, 'O')) {
            System.out.println("¡Jugador O ha ganado!");
        } else {
            System.out.println("¡El juego ha terminado en empate!");
        }
    }


    static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
/*-------------
|   |   |   | 
-------------
|   |   |   | 
-------------
|   |   |   | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2) separadas por espacio:*/