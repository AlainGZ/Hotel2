
package hotel.modelo;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;


public class Reserva {
    
    private Huesped huesped;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Reserva(Huesped huesped, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
    public long getDuracion(){
         return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }
     public double getCostoTotal() {
        return getDuracion() * habitacion.getCostoNoche();
    }
}

