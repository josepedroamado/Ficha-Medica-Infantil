package Logic;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class SystemTest {
   
    @Test
    public void testRegisterChild() {
        //Inicializacion
        Child h = new Child("Gaston", LocalDate.parse("2000-10-10"));
        System instance = new System();
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
        System instance = new System();
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
        System instance = new System();
        instance.ingresarHijo(name, birthDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
