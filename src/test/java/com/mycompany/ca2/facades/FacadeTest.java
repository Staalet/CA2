/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades;

import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.facades.interfaces.IFacade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Staal
 */
public class FacadeTest {
    private static EntityManagerFactory emf;
    private static IFacade facade;
    private EntityManager em;
    
    public FacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        emf = Persistence.createEntityManagerFactory("PU_test");
        facade = new Facade(emf);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        em = emf.createEntityManager();
    }
    
    @After
    public void tearDown() {
        em.clear();
        em.close();
    }
    /**
     * Test of getAllPersons method, of class Facade.
     */
    @Test
    public void testGetAllPersons() {
        System.out.println("getAllPersons");
       
        List<Person> expResult = null;
        List<Person> result = facade.getAllPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonById method, of class Facade.
     */
    @Test
    public void testGetPersonById() {
        System.out.println("getPersonById");
        int personId = 0;
       
        Person expResult = null;
        Person result = facade.getPersonById(personId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonsByHobby method, of class Facade.
     */
    @Test
    public void testGetPersonsByHobby() {
        System.out.println("getPersonsByHobby");
        String hobby = "";
       
        List<Person> expResult = null;
        List<Person> result = facade.getPersonsByHobby(hobby);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class Facade.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        Person person = null;
       
        Person expResult = null;
        Person result = facade.addPerson(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPerson method, of class Facade.
     */
    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
        Person person = null;
       
        Person expResult = null;
        Person result = facade.editPerson(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePerson method, of class Facade.
     */
    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        Person person = null;
       
        Person expResult = null;
        Person result = facade.deletePerson(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCompanies method, of class Facade.
     */
    @Test
    public void testGetAllCompanies() {
        System.out.println("getAllCompanies");
       
        List<Company> expResult = null;
        List<Company> result = facade.getAllCompanies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyById method, of class Facade.
     */
    @Test
    public void testGetCompanyById() {
        System.out.println("getCompanyById");
        int companyId = 0;
       
        Company expResult = null;
        Company result = facade.getCompanyById(companyId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyByCvr method, of class Facade.
     */
    @Test
    public void testGetCompanyByCvr() {
        System.out.println("getCompanyByCvr");
        int cvr = 0;
       
        Company expResult = null;
        Company result = facade.getCompanyByCvr(cvr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompany method, of class Facade.
     */
    @Test
    public void testAddCompany() {
        System.out.println("addCompany");
        Company company = null;
       
        Company expResult = null;
        Company result = facade.addCompany(company);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editCompany method, of class Facade.
     */
    @Test
    public void testEditCompany() {
        System.out.println("editCompany");
        Company company = null;
       
        Company expResult = null;
        Company result = facade.editCompany(company);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCompany method, of class Facade.
     */
    @Test
    public void testDeleteCompany() {
        System.out.println("deleteCompany");
        Company company = null;
       
        Company expResult = null;
        Company result = facade.deleteCompany(company);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
