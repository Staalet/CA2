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
 * @author lucasmfredmark
 */
public class FacadeTest {
//    private static EntityManagerFactory emf;
//    private static IFacade facade;
//    private EntityManager em;
//    
//    public FacadeTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//        emf = Persistence.createEntityManagerFactory("PU_test");
//        facade = new Facade(emf);
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//        em = emf.createEntityManager();
//    }
//    
//    @After
//    public void tearDown() {
//        em.close();
//    }
//
//    /**
//     * Test of addInfoEntity method, of class Facade.
//     */
//    @Test
//    public void testAddInfoEntity() {
//        System.out.println("addInfoEntity");
//        
//        Person person = new Person();
//        person.setFirstName("John");
//        
//        Person expResult = person;
//        Person result = (Person) facade.addInfoEntity(person);
//        
//        assertEquals(expResult.getFirstName(), result.getFirstName());
//    }
//
//    /**
//     * Test of editInfoEntity method, of class Facade.
//     */
//    @Test
//    public void testEditInfoEntity() {
//        System.out.println("editInfoEntity");
//        
//        int infoEntityId = 1;
//        Person person = new Person();
//        person.setFirstName("Foo");
//        
//        Person expResult = person;
//        Person result = (Person) facade.editInfoEntity(infoEntityId, person);
//        
//        assertEquals(expResult.getFirstName(), result.getFirstName());
//    }
//
//    /**
//     * Test of deleteInfoEntity method, of class Facade.
//     */
//    @Test
//    public void testDeleteInfoEntity() {
//        System.out.println("deleteInfoEntity");
//        
//        int infoEntityId = 11;
//        Person person = new Person();
//        person.setFirstName("Foo");
//        
//        Person expResult = person;
//        Person result = (Person) facade.deleteInfoEntity(infoEntityId);
//        
//        assertEquals(expResult.getFirstName(), result.getFirstName());
//    }
//
//    /**
//     * Test of getAllPersons method, of class Facade.
//     */
//    @Test
//    public void testGetAllPersons() {
//        System.out.println("getAllPersons");
//        
//        int expResult = 11;
//        List<Person> result = facade.getAllPersons();
//        
//        assertEquals(expResult, result.size());
//    }
//
//    /**
//     * Test of getPersonById method, of class Facade.
//     */
//    @Test
//    public void testGetPersonById() {
//        System.out.println("getPersonById");
//        
//        int personId = 6;
//        String firstName = "Person 6";
//        
//        String expResult = firstName;
//        Person result = facade.getPersonById(personId);
//        
//        assertEquals(expResult, result.getFirstName());
//    }
//
//    /**
//     * Test of getPersonsByHobby method, of class Facade.
//     */
//    @Test
//    public void testGetPersonsByHobby() {
//        System.out.println("getPersonsByHobby");
//        
//        String hobby = "Gaming";
//        int expResult = 5;
//        List<Person> result = facade.getPersonsByHobby(hobby);
//        
//        assertEquals(expResult, result.size());
//    }
//
//    /**
//     * Test of getAllCompanies method, of class Facade.
//     */
//    @Test
//    public void testGetAllCompanies() {
//        System.out.println("getAllCompanies");
//        
//        int expResult = 10;
//        List<Company> result = facade.getAllCompanies();
//        
//        assertEquals(expResult, result.size());
//    }
//
//    /**
//     * Test of getCompanyById method, of class Facade.
//     */
//    @Test
//    public void testGetCompanyById() {
//        System.out.println("getCompanyById");
//        
//        int companyId = 14;
//        String name = "Company 4";
//        
//        String expResult = name;
//        Company result = facade.getCompanyById(companyId);
//        
//        assertEquals(expResult, result.getName());
//    }
//
//    /**
//     * Test of getCompanyByCvr method, of class Facade.
//     */
//    @Test
//    public void testGetCompanyByCvr() {
//        System.out.println("getCompanyByCvr");
//        
//        int cvr = 75971439;
//        String name = "Company 9";
//        
//        String expResult = name;
//        Company result = facade.getCompanyByCvr(cvr);
//        
//        assertEquals(expResult, result.getName());
//    }
    
}
