/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.test;

import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.facades.Facade;
import com.mycompany.ca2.facades.interfaces.IFacade;
import javax.persistence.Persistence;

/**
 *
 * @author lucasmfredmark
 */
public class Test {
    private static final IFacade FACADE = new Facade(Persistence.createEntityManagerFactory("PU"));
    
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("Test");
        p1.setLastName("Testesen");
        p1.setHobbies(null);
        
        Person p2 = new Person();
        p2.setFirstName("Test 2");
        p2.setLastName("Testesen 2");
        p2.setHobbies(null);
        
        Company c1 = new Company();
        c1.setName("Company 1");
        c1.setDescription("Description 1");
        c1.setCvr("23984783");
        c1.setNumEmployees("30");
        c1.setMarketValue("9999999");
        
        Company c2 = new Company();
        c2.setName("Company 2");
        c2.setDescription("Description 2");
        c2.setCvr("89475924");
        c2.setNumEmployees("100");
        c2.setMarketValue("1000");
        
        FACADE.addInfoEntity(p1);
        FACADE.addInfoEntity(p2);
        FACADE.addInfoEntity(c1);
        FACADE.addInfoEntity(c2);
    }
}
