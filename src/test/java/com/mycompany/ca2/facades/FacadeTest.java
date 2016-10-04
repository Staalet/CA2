/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades;

import com.mycompany.ca2.entities.Cityinfo;
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
     * Test of getPersonByPhoneNumber method, of class Facade.
     */
    @Test
    public void testGetPersonByPhoneNumber() {
        System.out.println("getPersonByPhoneNumber");
        
        int phoneNumber = 88888888;
        
        Person expResult = new Person(1);
        Person result = facade.getPersonByPhoneNumber(phoneNumber);
        assertEquals(expResult.getPersonId(), result.getPersonId());
        
      
    }

    /**
     * Test of getCompanyByPhoneNumber method, of class Facade.
     */
    @Test
    public void testGetCompanyByPhoneNumber() {
        System.out.println("getCompanyByPhoneNumber");
        int phoneNumber = 0;
        
        Company expResult = null;
        Company result = facade.getCompanyByPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCompanyByCVR method, of class Facade.
     */
    @Test
    public void testGetCompanyByCVR() {
        System.out.println("getCompanyByCVR");
        int cvr = 0;
       
        Company expResult = null;
        Company result = facade.getCompanyByCVR(cvr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPersonsWithHobby method, of class Facade.
     */
    @Test
    public void testGetPersonsWithHobby() {
        System.out.println("getPersonsWithHobby");
        String hobby = "";
       
        List<Person> expResult = null;
        List<Person> result = facade.getPersonsWithHobby(hobby);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAllPersonsByZipCode method, of class Facade.
     */
    @Test
    public void testGetAllPersonsByZipCode() {
        System.out.println("getAllPersonsByZipCode");
        int zip = 0;
       
        List<Person> expResult = null;
        List<Person> result = facade.getAllPersonsByZipCode(zip);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getAllZipCodesInCountry method, of class Facade.
     */
    @Test
    public void testGetAllZipCodesInCountry() {
        System.out.println("getAllZipCodesInCountry");
        String country = "";
       
        List<Cityinfo> expResult = null;
        List<Cityinfo> result = facade.getAllZipCodesInCountry(country);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCompaniesWithEmployeeCountOverX method, of class Facade.
     */
    @Test
    public void testGetCompaniesWithEmployeeCountOverX() {
        System.out.println("getCompaniesWithEmployeeCountOverX");
        int x = 0;
       
        List<Company> expResult = null;
        List<Company> result = facade.getCompaniesWithEmployeeCountOverX(x);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of addAdress method, of class Facade.
     */
    @Test
    public void testAddAdress() {
        System.out.println("addAdress");
       
        facade.addAdress();
       
    }

    /**
     * Test of deleteAdress method, of class Facade.
     */
    @Test
    public void testDeleteAdress() {
        System.out.println("deleteAdress");
       
        facade.deleteAdress();
       
    }

    /**
     * Test of editAdress method, of class Facade.
     */
    @Test
    public void testEditAdress() {
        System.out.println("editAdress");
       
        facade.editAdress();
       
    }

    /**
     * Test of addCityInfo method, of class Facade.
     */
    @Test
    public void testAddCityInfo() {
        System.out.println("addCityInfo");
       
        facade.addCityInfo();
       
    }

    /**
     * Test of deleteCityInfo method, of class Facade.
     */
    @Test
    public void testDeleteCityInfo() {
        System.out.println("deleteCityInfo");
       
        facade.deleteCityInfo();
      
    }

    /**
     * Test of editCityInfo method, of class Facade.
     */
    @Test
    public void testEditCityInfo() {
        System.out.println("editCityInfo");
       
        facade.editCityInfo();
      
    }

    /**
     * Test of addCompany method, of class Facade.
     */
    @Test
    public void testAddCompany() {
        System.out.println("addCompany");
       
        facade.addCompany();
     
    }

    /**
     * Test of deleteCompany method, of class Facade.
     */
    @Test
    public void testDeleteCompany() {
        System.out.println("deleteCompany");
       
        facade.deleteCompany();
       
    }

    /**
     * Test of editCompany method, of class Facade.
     */
    @Test
    public void testEditCompany() {
        System.out.println("editCompany");
       
        facade.editCompany();
       
    }

    /**
     * Test of addHobby method, of class Facade.
     */
    @Test
    public void testAddHobby() {
        System.out.println("addHobby");
       
        facade.addHobby();
       
    }

    /**
     * Test of deleteHobby method, of class Facade.
     */
    @Test
    public void testDeleteHobby() {
        System.out.println("deleteHobby");
       
        facade.deleteHobby();
        
    }

    /**
     * Test of editHobby method, of class Facade.
     */
    @Test
    public void testEditHobby() {
        System.out.println("editHobby");
       
        facade.editHobby();
       
    }

    /**
     * Test of addHobbyPerson method, of class Facade.
     */
    @Test
    public void testAddHobbyPerson() {
        System.out.println("addHobbyPerson");
       
        facade.addHobbyPerson();
      
    }

    /**
     * Test of deleteHobbyPerson method, of class Facade.
     */
    @Test
    public void testDeleteHobbyPerson() {
        System.out.println("deleteHobbyPerson");
       
        facade.deleteHobbyPerson();
     
    }

    /**
     * Test of editHobbyPerson method, of class Facade.
     */
    @Test
    public void testEditHobbyPerson() {
        System.out.println("editHobbyPerson");
       
        facade.editHobbyPerson();
        
    }

    /**
     * Test of addInfoentity method, of class Facade.
     */
    @Test
    public void testAddInfoentity() {
        System.out.println("addInfoentity");
       
        facade.addInfoentity();
        
    }

    /**
     * Test of deleteInfoentity method, of class Facade.
     */
    @Test
    public void testDeleteInfoentity() {
        System.out.println("deleteInfoentity");
       
        facade.deleteInfoentity();
      
    }

    /**
     * Test of editInfoentity method, of class Facade.
     */
    @Test
    public void testEditInfoentity() {
        System.out.println("editInfoentity");
       
        facade.editInfoentity();
        
    }

    /**
     * Test of addPerson method, of class Facade.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
       
        facade.addPerson();
        
    }

    /**
     * Test of deletePerson method, of class Facade.
     */
    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
       
        facade.deletePerson();
       
    }

    /**
     * Test of editPerson method, of class Facade.
     */
    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
       
        facade.editPerson();
      
    }

    /**
     * Test of addPhone method, of class Facade.
     */
    @Test
    public void testAddPhone() {
        System.out.println("addPhone");
       
        facade.addPhone();
        
    }

    /**
     * Test of deletePhone method, of class Facade.
     */
    @Test
    public void testDeletePhone() {
        System.out.println("deletePhone");
       
        facade.deletePhone();
        
    }

    /**
     * Test of editPhone method, of class Facade.
     */
    @Test
    public void testEditPhone() {
        System.out.println("editPhone");
       
        facade.editPhone();
      
    }
    
}
