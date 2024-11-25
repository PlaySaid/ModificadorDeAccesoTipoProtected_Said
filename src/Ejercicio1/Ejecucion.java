package Ejercicio1;

public class Ejecucion {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Ostin", 2300000);
        empleado.mostrarInformacion();
        
        System.out.println("");
        
        Gerente gerente = new Gerente("John", 4000000, "Ventas");
        gerente.mostrarInformacion();
        /*
        muestra los datos correctamente en la ejecucion, porque private permite
        que las propiedades o metodos sean usados dentro del mismo paquete.
        */
    }
    
}
