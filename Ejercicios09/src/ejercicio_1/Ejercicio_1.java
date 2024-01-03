import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limEsts = 28;
        int limNotas = 3;
        double mayorPromedio = 0, menorPromedio = 0;
        String estudianteMayor = "", estudianteMenor = "";
        String[] arrNombEst = new String[limEsts];
        double[][] arrNotasEst = new double[limEsts][limNotas];
        double[] arrPromEst = new double[limEsts];
        double promedioCurso, sumaPromedios = 0;

        for (int i = 0; i < limEsts; i++) {
            for (int j = 0; j < limNotas; j++) {
                arrNotasEst[i][j] = Math.floor(Math.random() * 11);
            }
        }
        for (int i = 0; i < limEsts; i++) {
            System.out.print("Ingrese nombre del Estudiante: ");
            arrNombEst[i] = scanner.next();
        }

        for (int i = 0; i < limEsts; i++) {
            arrPromEst[i] = (arrNotasEst[i][0] * 0.35) + (arrNotasEst[i][1] * 0.35) + (arrNotasEst[i][2] * 0.3);
            sumaPromedios += arrPromEst[i];
        }
        promedioCurso = sumaPromedios / limEsts;
        for (int i = 0; i < limEsts; i++) {
            System.out.println("Promedio del estudiante " + arrNombEst[i] + ": " + arrPromEst[i]);
        }
        System.out.println("Promedio del curso: " + promedioCurso);
        System.out.println("Estudiantes con promedio superior al del curso:");
        for (int i = 0; i < limEsts; i++) {
            if (arrPromEst[i] > promedioCurso) {
                System.out.println(arrNombEst[i] + " | PROMEDIO: " + arrPromEst[i]);
            }
        }
        System.out.println("Estudiantes con promedio inferior al del curso:");
        for (int i = 0; i < limEsts; i++) {
            if (arrPromEst[i] < promedioCurso) {
                System.out.println(arrNombEst[i] + " | PROMEDIO: " + arrPromEst[i]);
            }
        }
        mayorPromedio = arrPromEst[0];
        menorPromedio = arrPromEst[0];
        for (int i = 1; i < limEsts; i++) {
            if (arrPromEst[i] > mayorPromedio) {
                mayorPromedio = arrPromEst[i];
                estudianteMayor = arrNombEst[i];
            }
            if (arrPromEst[i] < menorPromedio) {
                menorPromedio = arrPromEst[i];
                estudianteMenor = arrNombEst[i];
            }
        }
        System.out.println("Estudiante con el mayor promedio: " + estudianteMayor + " | Promedio: " + mayorPromedio);
        System.out.println("Estudiante con el menor promedio: " + estudianteMenor + " | Promedio: " + menorPromedio);
    }
}