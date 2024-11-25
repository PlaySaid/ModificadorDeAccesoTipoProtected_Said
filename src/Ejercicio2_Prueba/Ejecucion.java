package Ejercicio2_Prueba;

import Ejercicio2.Vehiculo;

public class Ejecucion {

    public static void main(String[] args) {
        
        Vehiculo vehi = new Vehiculo("Carro","B450M");
        
        System.out.println(vehi.marca);
        
        //Esto da error porque el modificador de acceso Protected solo permite acceso si se usa dentro
        //de la misma clase, en alguna sub clase y dentro del mismo paquete
    }
    
}
