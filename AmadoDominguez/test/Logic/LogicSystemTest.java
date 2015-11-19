package Logic;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogicSystemTest {
    
    @Test
    public void testIngresarHijo() {
        //Inicializacion
        System.out.println("ingresarHijo");
        String name = "Juancito";
        LocalDate birthDate = LocalDate.parse("1990-10-10");
        LogicSystem instance = new LogicSystem();
        //Manipulacion
        instance.ingresarHijo(name, birthDate);
        Child h = new Child(name, birthDate);
        // Verificacion
        assertTrue(instance.getListAllChildren().contains(h));
    }

    @Test
    public void testIngresarHijoCheckCorrecto() {
        //Inicializacion
        System.out.println("ingresarHijoCheckCorrecto");
        String name = "Juancito";
        LocalDate birthDate = LocalDate.parse("1990-10-10");
        LogicSystem instance = new LogicSystem();
        //Manipulacion
        boolean result = instance.ingresarHijoCheck(name, birthDate);
        //Verificacion
        assertTrue(result);
    }
    
    @Test
    public void testIngresarHijoCheckSinNombre() {
        //Inicializacion
        System.out.println("ingresarHijoCheckSinFecha");
        String name = "";
        LocalDate birthDate = LocalDate.parse("1990-10-10");
        LogicSystem instance = new LogicSystem();
        //Manipulacion
        boolean result = instance.ingresarHijoCheck(name, birthDate);
        //Verificacion
        assertFalse(result);
    }
    
    @Test
    public void testIngresarHijoCheckSinFecha() {
        //Inicializacion
        System.out.println("ingresarHijoCheckSinFecha");
        String name = "Juancito";
        LocalDate birthDate = null;
        LogicSystem instance = new LogicSystem();
        //Manipulacion
        boolean result = instance.ingresarHijoCheck(name, birthDate);
        //Verificacion
        assertFalse(result);
    }
    
    @Test
    public void testIngresarHijoCheckSinNombreSinFecha() {
        //Inicializacion
        System.out.println("ingresarHijoCheckSinNombreSinFecha");
        String name = "";
        LocalDate birthDate = null;
        LogicSystem instance = new LogicSystem();
        //Manipulacion
        boolean result = instance.ingresarHijoCheck(name, birthDate);
        //Verificacion
        assertFalse(result);
    }
}
