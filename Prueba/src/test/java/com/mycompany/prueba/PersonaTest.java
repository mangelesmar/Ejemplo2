/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class PersonaTest {
    
    private Persona persona;
    private static Persona p;
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        p = new Persona(null);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
      Persona persona = new Persona("Mari");
      
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLongitud() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("testLongitud");
//        Persona p = new Persona("Teresa");
        assertTrue(persona.getNombre().length()>5);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testNull() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("testNull");
//        Persona p = new Persona();
        String nombre2;
        
        nombre2=p.getNombre().toUpperCase();
    }
}
