/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.test;

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
        
        FACADE.addInfoEntity(p1);
    }
}
