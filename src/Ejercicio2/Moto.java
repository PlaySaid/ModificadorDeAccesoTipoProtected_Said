package Ejercicio2;

public class Moto extends Vehiculo{
    
    private int cilindrada;
    
    public Moto(String marca, String tipo, int cilindrada) {
        super(tipo,marca);
        this.cilindrada = cilindrada;
    }
}
