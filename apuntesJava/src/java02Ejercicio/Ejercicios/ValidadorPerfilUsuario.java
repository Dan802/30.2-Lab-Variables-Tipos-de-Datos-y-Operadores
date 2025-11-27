package java02Ejercicio.Ejercicios;

import java.util.Scanner;

public class ValidadorPerfilUsuario {

    public static void iniciarSesion() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Edad: ");
        int edad = scanner.nextInt();

        System.out.println("Saldo de cuenta: ");
        double saldoCuenta = scanner.nextDouble();

        System.out.println("Es premiun(0 o 1): ");
        boolean esPremium = scanner.hasNextBoolean();

        scanner.close();

        boolean accesoExclusivo  = false;
        boolean calificaPromocion  = false;
        boolean perfilIncompleto  = false;
        boolean perfilActivoTotal = false;

        if(edad >= 18 && esPremium){
            // Será true si la edad es mayor o igual a 18 Y si el usuario esPremium
            accesoExclusivo = true;
        }

        if(saldoCuenta > 1000 || edad < 25) {
            // Será true si el saldoCuenta es mayor a 1000 O si la edad es menor de 25
            calificaPromocion = true;
        }

        if(saldoCuenta == 0 || !nombreUsuario.equals("invitado")) {
            // Será true si el saldoCuenta es igual a 0 O si el nombreUsuario NO es igual a "invitado"
            perfilIncompleto = true;
        }

        if(!perfilIncompleto && (accesoExclusivo || calificaPromocion)){
            // Será true si NO tiene perfilIncompleto Y (si tiene accesoExclusivo O si calificaPromocion).
            perfilActivoTotal = true;
        }

        System.out.println("Acceso exclusivo? " + ((accesoExclusivo) ? "si" : "no"));
        System.out.println("Califica a promoción? " + ((calificaPromocion) ? "si" : "no"));
        System.out.println("Perfil incompleto? " + ((perfilIncompleto) ? "si" : "no"));
        System.out.println("Perfil activo total? " + ((perfilActivoTotal) ? "si" : "no"));
    }
}