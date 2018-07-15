package actividad4;

import java.util.Scanner;

/**
 * Módulo de Pagos de Membresías Online para los Clientes
 *
 * @author Mauricio
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String apellido;
        String telefono;
        String numeroTarjeta;
        String caducidadTarjeta;
        String monto;

        Scanner lector = new Scanner(System.in);

        System.out.println("Por favor ingrese la información para su factura");
        System.out.printf("\n");

        System.out.printf("Ingrese el Nombre:");
        nombre = lector.nextLine();

        System.out.printf("Ingrese el Apellido:");
        apellido = lector.nextLine();

        System.out.printf("Ingrese el Teléfono:");
        telefono = lector.nextLine();

        System.out.printf("Ingrese el Número de la Tarjeta:");
        numeroTarjeta = lector.nextLine();

        System.out.printf("Ingrese la Fecha de Caducidad de la Tarjeta:");
        caducidadTarjeta = lector.nextLine();

        System.out.printf("Ingrese el Monto a cancelar:");
        monto = lector.nextLine();

        System.out.printf("Los datos de su factura serán los siguientes:");
        System.out.printf("\n");
        System.out.printf("Nombres: " + nombre);
        System.out.printf("\n");
        System.out.printf("Apellidos: " + apellido);
        System.out.printf("\n");
        System.out.printf("Teléfono: " + telefono);
        System.out.printf("\n");
        System.out.printf("Número de la Tarjeta: " + numeroTarjeta);
        System.out.printf("\n");
        System.out.printf("Fecha de Caducidad de la Tarjeta: " + caducidadTarjeta);
        System.out.printf("\n");
        System.out.printf("Monto a Cancelar: $" + monto);
        System.out.printf("\n");
        System.out.printf("INFORMACION GUARDADA, MUCHAS GRACIAS POR REALIZAR SU PAGO");
        System.out.printf("\n");

        System.out.printf("\n");
    }

}
