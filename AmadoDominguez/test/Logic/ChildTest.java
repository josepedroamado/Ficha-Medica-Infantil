/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChildTest {
   
    @Test
    public void testAddAppointment() {
        //Inicializacion
        System.out.println("addAppointment");
        String nota = "La Nota";
        LocalDate fecha = LocalDate.parse("2000-10-10");
        Child instance = new Child("Juancito", LocalDate.parse("1990-10-10"));
        //Manipulacion
        instance.addAppointment(nota, fecha);
        Appointment ap = new Appointment(nota, fecha);
        // Verificacion      
        assertTrue(instance.getListAppointments().contains(ap));
    }

    @Test
    public void testAddAppointmentCheckCorrecto() {
        //Inicializacion
        System.out.println("addAppointmentCheckCorrecto");
        String nota = "La Nota";
        LocalDate fecha = LocalDate.parse("2000-10-10");
        Child instance = new Child("Juancito", LocalDate.parse("1990-10-10"));
        //Manipulacion
        boolean result = instance.addAppointmentCheck(nota, fecha);
        // Verificacion
        assertTrue(result);
    }
    
    @Test
    public void testAddAppointmentCheckSinFecha() {
        //Inicializacion
        System.out.println("addAppointmentCheckSinFecha");
        String nota = "La Nota";
        LocalDate fecha = null;
        Child instance = new Child("Juancito", LocalDate.parse("1990-10-10"));
        //Manipulacion
        boolean result = instance.addAppointmentCheck(nota, fecha);
        //Verificacion
        assertFalse(result);
    }

    @Test
    public void testAddGrowth() {
        //Inicializacion
        System.out.println("addGrowth");
        LocalDate fecha = LocalDate.parse("2000-10-10");
        int altura = 90;
        int peso = 12;
        int perimetroCraneal = 45;
        Child instance = new Child("Juancito", LocalDate.parse("1990-10-10"));
        //Manipulacion
        instance.addGrowth(fecha, altura, peso, perimetroCraneal);
        Growth gr = new Growth(fecha, altura, peso, perimetroCraneal);
        //Verificacion
        assertTrue(instance.getListGrowth().contains(gr));
    }

    @Test
    public void testAddGrowthCheckCorrecto() {
        //Inicializacion
        System.out.println("addGrowthCheckCorrecto");
        LocalDate fecha = LocalDate.parse("2000-10-10");
        int altura = 90;
        int peso = 12;
        int perimetroCraneal = 45;
        Child instance = new Child("Juancito", LocalDate.parse("1999-02-10"));
        //Manipulacion
        boolean result = instance.addGrowthCheck(fecha, altura, peso, perimetroCraneal);
        //Verificacion
        assertTrue(result);
    }
    
    @Test
    public void testAddGrowthCheckSinFecha() {
        //Inicializacion
        System.out.println("addGrowthCheckSinFecha");
        LocalDate fecha = null;
        int altura = 90;
        int peso = 12;
        int perimetroCraneal = 45;
        Child instance = new Child("Juancito", LocalDate.parse("1999-02-10"));
        //Manipulacion
        boolean result = instance.addGrowthCheck(fecha, altura, peso, perimetroCraneal);
        //Verificacion
        assertFalse(result);
    }
    
    @Test
    public void testAddGrowthCheckMedidaIncorrecta() {
        //Inicializacion
        System.out.println("addGrowthCheckMedidaIncorrecta");
        LocalDate fecha = LocalDate.parse("2000-10-10");
        int altura = 0;
        int peso = 12;
        int perimetroCraneal = 45;
        Child instance = new Child("Juancito", LocalDate.parse("1999-02-10"));
        //Manipulacion
        boolean result = instance.addGrowthCheck(fecha, altura, peso, perimetroCraneal);
        //Verificacion
        assertFalse(result);
    }
}
