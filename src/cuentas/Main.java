


package cuentas;

/**
 * Esta es la clase principal del proyecto Deposito, que corresponde con la Tarea04 de la
 * asignatura Entornos de Desarrollo de DAW.
 *
 * @author RafaelIzaguirre
 * @version 1.0
 * @since 20.03.2022
 **/
public class Main {


    public static void main(String[] args) {

        operativa_cuenta(0);
    }

    private static void operativa_cuenta(float cantidad) {
        
        /**
         * Metodo obtenido de la refactorización
         */ 
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
