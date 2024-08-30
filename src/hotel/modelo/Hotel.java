
package hotel.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Hotel {
    
    private List<Habitacion> habitaciones;
    private List<Reserva> reservaciones;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.reservaciones = new ArrayList<>();
    }
    
    
    public void addHabitacion (Habitacion habitacion){
        habitaciones.add(habitacion);
    }
    
    public void addReserva(Reserva reserva) {
        if (reserva.getHabitacion().isDisponible()) {
            reservaciones.add(reserva);
            reserva.getHabitacion().setDisponible(false);
            reserva.getHuesped().addReserva(reserva);
        } else {
            System.out.println("La habitación no está disponible.");
        }
    }
    
    
    public void cancelReserva(Reserva reserva){
        reservaciones.remove(reserva);
        reserva.getHabitacion().setDisponible(true);
    }
   
    public boolean isHabitacionDisponible(int numeroHabitacion, LocalDate fechaInicio, LocalDate fechaFin){
        
        for(Reserva reserva : reservaciones){
            if(reserva.getHabitacion().getNumeroHabitacion() == numeroHabitacion &&
                   !(fechaFin.isBefore(reserva.getFechaInicio()) || fechaInicio.isAfter(reserva.getFechaFin()))){
                return false;
            }
            
        }
        return true;
    }

    
}
