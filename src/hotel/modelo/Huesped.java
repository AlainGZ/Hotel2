
package hotel.modelo;

import java.util.ArrayList;
import java.util.List;


public class Huesped {
    
    private final String nombre;
    private String apellido;
    private String id;
    private List<Reserva> reservaciones;

    public Huesped(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.reservaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

   
    
    
    public void addReserva (Reserva reservacion){
        reservaciones.add(reservacion);
    }
    
    @Override
    public String toString() {
        return nombre + " " + apellido + " (ID: " + id + ")";
    }
}
