/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.rest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.parsing.Parser;
import static org.hamcrest.Matchers.*;


/**
 *
 * @author MalteBruun
 */
public class PersonResourceIT {
    
    public PersonResourceIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getJson method, of class PersonResource.
     */
    @Test
    public void testGetJson() {
        System.out.println("getJson");
        PersonResource instance = new PersonResource();
        String expResult = "";
        String result = instance.getJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class PersonResource.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        String jsonPerson = "";
        PersonResource instance = new PersonResource();
        String expResult = "";
        String result = instance.addPerson(jsonPerson);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPerson method, of class PersonResource.
     */
    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
        int id = 0;
        String jsonPerson = "";
        PersonResource instance = new PersonResource();
        String expResult = "";
        String result = instance.editPerson(id, jsonPerson);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePerson method, of class PersonResource.
     */
    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        int id = 0;
        PersonResource instance = new PersonResource();
        String expResult = "";
        String result = instance.deletePerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPersons method, of class PersonResource.
     */
    @Test
    public void testGetAllPersons() {
        System.out.println("getAllPersons");
        PersonResource instance = new PersonResource();
        String expResult = "";
        String result = instance.getAllPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonById method, of class PersonResource.
     */
    @Test
    public void testGetPersonById() {
        System.out.println("getPersonById");
        int id = 0;
        PersonResource instance = new PersonResource();
        String expResult = "";
        String result = instance.getPersonById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonsByHobby method, of class PersonResource.
     */
    @Test
    public void testGetPersonsByHobby() {
        System.out.println("getPersonsByHobby");
        String hobby = "";
        PersonResource instance = new PersonResource();
        String expResult = "";
        String result = instance.getPersonsByHobby(hobby);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putJson method, of class PersonResource.
     */
    @Test
    public void testPutJson() {
        System.out.println("putJson");
        String content = "";
        PersonResource instance = new PersonResource();
        instance.putJson(content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
