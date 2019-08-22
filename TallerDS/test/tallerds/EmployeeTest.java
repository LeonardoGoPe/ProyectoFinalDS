/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerds;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vielka
 */

public class EmployeeTest extends TestCase {
    
    public EmployeeTest() {
    }
    
    

    /**
     * Test of cs method, of class Employee.
     */
    //Probamos que el cs funcione para todos tipos de empleados
   
    @Test
    public void testCsWorker() {
        System.out.println("cs testCsWorker");
        Employee instance = new Employee(360.0F,"USD",0.10F,EmployeeType.Worker);
        float expResult =360.0F;
        float result = instance.cs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCsSupervisor() {
        System.out.println("cs-testCsSupervisor");
        Employee instance = new Employee(460.0F,"USD",0.50F,EmployeeType.Supervisor);
        float expResult =460.175F;
        float result = instance.cs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCsManager() {
        System.out.println("cs-testCsManager");
        Employee instance = new Employee(560.0F,"USD",0.70F,EmployeeType.Manager);
        float expResult =560.49F;
        float result = instance.cs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Probar que funcione con otro tipo de moneda
    @Test
    public void testCsSupervisorEU() {
        
        System.out.println("cs-testCsSupervisorEU");
        Employee instance = new Employee(460.0F,"EU",0.50F,EmployeeType.Supervisor);
        float expResult =437.175F;
        float result = instance.cs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    
    
    
////////////////////////////////////////////////////////////////////////////////
    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    
    //Usamos los tipos de diferntes de escenarios para calcular el YearBonus, 
    //adicionalmente probamos con otro tipo de modena en Manager
    @Test
    public void testCalculateYearBonusWorker() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(360.0F,"USD",0.10F,EmployeeType.Worker);
        float expResult = 386.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateYearBonusSupervisor() {
        System.out.println("CalculateYearBonus-testCalculateYearBonusSupervisor");
        Employee instance = new Employee(460.0F,"USD",0.50F,EmployeeType.Supervisor);
        float expResult = 653.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateYearBonusManager() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(560.0F,"EU",0.70F,EmployeeType.Manager);
        float expResult = 918.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
