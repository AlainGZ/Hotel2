
package hotel.modelo;

public class Habitacion {
    
    
    private int numeroHabitacion;
    private String tipo;
    private double costoNoche;
    private boolean disponible;

    public Habitacion(int numeroHabitacion, String tipo, double costoNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.costoNoche = costoNoche;
        this.disponible = true;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCostoNoche() {
        return costoNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

     public void setDisponible(boolean disponible){
         this.disponible = disponible; 
     }
    
    
     @Override
    public String toString() {
        return numeroHabitacion + " " + tipo ;
    }
    
    
    
}
