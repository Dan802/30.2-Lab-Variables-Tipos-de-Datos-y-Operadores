package java02OperadoresLogicos;

public class Apuntes {
    public static void main(String[] args) {
        System.out.println("\n----Operadores Logicos---------");
        boolean tienesDinero = true;
        boolean tienesTarjetaCredito = false;
        boolean estaHaciendoFrio = true;

        boolean puedeComprar = tienesDinero && tienesTarjetaCredito;

        System.out.println("¿Puedes Comprar: " + puedeComprar);

        int edad = 20;

        boolean puedeEntrar = (edad > 18) && estaHaciendoFrio;

        boolean puedeEntrar2 = (edad > 18) || estaHaciendoFrio;

    }
}
