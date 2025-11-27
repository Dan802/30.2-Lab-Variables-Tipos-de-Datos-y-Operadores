package java01Ejercicio;

import java.util.Scanner;

public class Facturacion {

    public static void main(String[] args) {

        // 30.2 - Lab - Variables, Tipos de Datos y Operadores - ENTREGA
        String nombreProducto;
        double precioProducto;
        int cantidadComprar;
        final double IMPUESTO = 0.21;
        double dineroCliente;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = scanner.nextDouble();

        System.out.print("Ingrese la cantidad a comprar: ");
        cantidadComprar = scanner.nextInt();

        System.out.print("Ingrese cuánto dinero trae el cliente: ");
        dineroCliente = scanner.nextDouble();

        scanner.close();

        // 3. Lógica de negocio
        double subtotal = precioProducto * cantidadComprar;
        double totalAPagar = subtotal + (subtotal * IMPUESTO);

        // casting explícito
        int totalSinCentavos = (int) totalAPagar;

        // 4. Validación
        boolean puedeComprar = dineroCliente >= totalAPagar;

        System.out.println("\n--- Factura ---");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Cantidad: " + cantidadComprar);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + (subtotal * IMPUESTO));
        System.out.println("Total a Pagar: $" + totalAPagar);
        System.out.println("Total sin centavos: $" + totalSinCentavos);
        System.out.println("---");
        System.out.println("Dinero del Cliente: $" + dineroCliente);
        System.out.println("¿Compra aprobada?: " + puedeComprar);
    }
}