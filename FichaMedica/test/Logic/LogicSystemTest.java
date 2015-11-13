package Logic;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogicSystemTest {
    
    @Test
    public void testIngresarHijo() {
        //Inicializacion
        System.out.println("ingresarHijo");
        String name = "Gaston";
        LocalDate birthDate = LocalDate.parse("1990-10-10");
        LogicSystem instance = new LogicSystem();
        //Manipulacion
        instance.ingresarHijo(name, birthDate);
        ArrayList listaVerificacion = new ArrayList <Child>();
        Child h = new Child (name, birthDate);
        listaVerificacion.add(h);
        // Verificacion
        assertEquals(listaVerificacion.contains(h), instance.getListAllChildren().contains(h));
    }

    @Test
    public void testIngresarHijoCheckCorrecto() {
        //Inicializacion
        System.out.println("ingresarHijoCheckCorrecto");
        String name = "Gaston";
        LocalDate birthDate = LocalDate.parse("1990-10-10");
        LogicSystem instance = new LogicSystem();
        boolean expResult = true;
        //Manipulacion
        boolean result = instance.ingresarHijoCheck(name, birthDate);
        //Verificacion
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIngresarHijoCheckSinNombre() {
        //Inicializacion
        System.out.println("ingresarHijoCheckSinFecha");
        String name = "";
        LocalDate birthDate = LocalDate.parse("1990-10-10");
        LogicSystem instance = new LogicSystem();
        boolean expResult = false;
        //Manipulacion
        boolean result = instance.ingresarHijoCheck(name, birthDate);
        //Verificacion
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIngresarHijoCheckSinFecha() {
        //Inicializacion
        System.out.println("ingresarHijoCheckSinFecha");
        String name = "Gaston";
        LocalDate birthDate = null;
        LogicSystem instance = new LogicSystem();
        boolean expResult = false;
        //Manipulacion
        boolean result = instance.ingresarHijoCheck(name, birthDate);
        //Verificacion
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIngresarHijoCheckSinNombreSinFecha() {
        //Inicializacion
        System.out.println("ingresarHijoCheckSinNombreSinFecha");
        String name = "";
        LocalDate birthDate = null;
        LogicSystem instance = new LogicSystem();
        boolean expResult = false;
        //Manipulacion
        boolean result = instance.ingresarHijoCheck(name, birthDate);
        //Verificacion
        assertEquals(expResult, result);
    }
}
