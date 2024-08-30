
package hotel2;

import hotel.modelo.Habitacion;
import hotel.modelo.Hotel;
import hotel.modelo.Huesped;
import hotel.modelo.Reserva;
import java.time.LocalDate;


public class Main {

   
    public static void main(String[] args) {
        
        
          Hotel hotel = new Hotel();
        
        Habitacion habit1 = new Habitacion(101,"Suit",300000.00);
        Habitacion habit2 = new Habitacion(102,"Doble",150000.00);
        
        hotel.addHabitacion(habit1);
        hotel.addHabitacion(habit2);
        
        Huesped huesped1 = new Huesped("Jorge","Martinez","1030456789");
        Huesped huesped2 = new Huesped("Pedro","Gonzalez","1080456780");
        
       LocalDate fechaInicio = LocalDate.of(2024, 8, 7);
       LocalDate fechaFin = LocalDate.of(2024, 8, 10);
       
       if(hotel.isHabitacionDisponible(habit1.getNumeroHabitacion(), fechaInicio, fechaFin)){
           
           Reserva reserva1 = new Reserva(huesped1, habit1, fechaInicio, fechaFin);
              
           hotel.addReserva(reserva1);
           System.out.println("Reservacion agregada con exito, el costo del servicio es de: "+reserva1.getCostoTotal());
           
       }else{
           System.out.println("La habitacion no esta disponible");
       }
       
       
        if(hotel.isHabitacionDisponible(habit2.getNumeroHabitacion(), fechaInicio, fechaFin)){
           
           Reserva reserva2 = new Reserva(huesped2, habit2, fechaInicio, fechaFin);
              
           hotel.addReserva(reserva2);
           System.out.println("Reservacion agregada con exito, el costo del servicio es de: "+reserva2.getCostoTotal()+" a nombre de: "+reserva2.getHuesped());
           
       }else{
           System.out.println("La habitacion no esta disponible");
       }
    }
    
}
