import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double precio, iva, totalConIva, totalSinIva;
        int numProductos, cantidadDeseada, codigoFacturar;
        boolean encontrado = false;
        iva = 0.12;
        System.out.print("Ingrese el número de productos a ingresar al inventario: ");
        numProductos = scanner.nextInt();
        String[] nombresProducto = new String[numProductos];
        int[][] datosProducto = new int[numProductos][3];
        for (int i = 0; i < numProductos; i++) {
            datosProducto[i][0] = i + 1;
            System.out.println("");
            System.out.println("Código del producto: " + datosProducto[i][0]);
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombresProducto[i] = scanner.next();
            System.out.print("Ingrese el precio del producto: ");
            datosProducto[i][1] = scanner.nextInt();
            System.out.print("Ingrese la cantidad del producto: ");
            datosProducto[i][2] = scanner.nextInt();
        }
        System.out.println("INVENTARIO");
        for (int i = 0; i < numProductos; i++) {
            System.out.println("Código: " + datosProducto[i][0] + ", Producto: " + nombresProducto[i]);
            System.out.println("--> Precio: $" + datosProducto[i][1] + ", Cantidad: " + datosProducto[i][2]);
        }
        System.out.println("");
        System.out.println("FACTURA: ");
        System.out.print("Ingrese el código del producto a facturar: ");
        codigoFacturar = scanner.nextInt();
        for (int i = 0; i < numProductos; i++) {
            if (datosProducto[i][0] == codigoFacturar) {
                encontrado = true;
                System.out.print("Ingrese la cantidad deseada a facturar para " + nombresProducto[i] + ": ");
                cantidadDeseada = scanner.nextInt();
                precio = datosProducto[i][1];
                totalSinIva = precio * cantidadDeseada;
                totalConIva = totalSinIva + (totalSinIva * iva);
                if (totalSinIva > 100) {
                    System.out.println("Su compra ha superado los $100, se ha aplicado un descuento (No se agrega el 12% de IVA)");
                    System.out.println("Producto: " + nombresProducto[i] + ", Cantidad: " + cantidadDeseada);
                    System.out.println("El valor total a pagar es de: $" + totalSinIva + " (descuento aplicado)");
                } else {
                    System.out.println("Producto: " + nombresProducto[i] + ", Cantidad: " + cantidadDeseada);
                    System.out.println("Total a pagar: $" + totalSinIva + " , Sumado el IVA (12%): $" + totalConIva + " (No se aplica descuento)");
                }
            }
        }
        if (!encontrado) {
            System.out.println("El producto no fue encontrado en el inventario.");
        }
    }
}
