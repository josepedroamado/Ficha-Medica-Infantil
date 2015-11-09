package Logic;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogicSystemTest {
   
    @Test
    public void testRegisterChild() {
        //Inicializacion
        Child h = new Child("Gaston", LocalDate.parse("2000-10-10"));
        LogicSystem instance = new LogicSystem();
        //Manipulacion
        instance.registerChild(h);      
        //Verificacion
        ArrayList listaVerificacion = new ArrayList<Child>();
        listaVerificacion.add(h);
        assertEquals(listaVerificacion.contains(h), instance.getListAllChildren().contains(h));
    }
    @Test
    public void testRegisterNullChild() {
        //Inicializacion
        Child h = null;
        LogicSystem instance = new LogicSystem();
        //Manipulacion
        instance.registerChild(h);      
        //Verificacion
        ArrayList listaVerificacion = new ArrayList<Child>();
        assertEquals(listaVerificacion.contains(h), instance.getListAllChildren().contains(h));
    }

    @Test
    public void testIngresarHijo() {
        String name = "Gaston";
        LocalDate birthDate = null;
        LogicSystem instance = new LogicSystem();
        instance.ingresarHijo(name, birthDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
