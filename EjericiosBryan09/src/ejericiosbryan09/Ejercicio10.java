package ejericiosbryan09;

public class Ejercicio10 {
    public static void main(String[] args) {
        int altura = 4;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = altura - 2; i >= 0; i--) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

/* * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   *   */