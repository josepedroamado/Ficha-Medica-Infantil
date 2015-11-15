/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pepe
 */
public class ChildTest {
   
    @Test
    public void testAddAppointment() {
        System.out.println("addAppointment");
        String nota = "";
        LocalDate fecha = null;
        Child instance = new Child();
        instance.addAppointment(nota, fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddAppointmentCheckCorrecto() {
        System.out.println("addAppointmentCheck");
        String nota = "La Nota";
        LocalDate fecha = LocalDate.now();
        Child instance = new Child();
        boolean expResult = false;
        boolean result = instance.addAppointmentCheck(nota, fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddGrowth() {
        System.out.println("addGrowth");
        LocalDate fecha = null;
        int altura = 0;
        int peso = 0;
        int perimetroCraneal = 0;
        Child instance = new Child();
        instance.addGrowth(fecha, altura, peso, perimetroCraneal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddGrowthCheck() {
        System.out.println("addGrowthCheck");
        LocalDate fecha = null;
        int altura = 0;
        int peso = 0;
        int perimetroCraneal = 0;
        Child instance = new Child();
        boolean expResult = false;
        boolean result = instance.addGrowthCheck(fecha, altura, peso, perimetroCraneal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Child.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Child instance = new Child();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Child.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Child instance = new Child();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
