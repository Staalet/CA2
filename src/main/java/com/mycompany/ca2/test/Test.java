/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.test;

import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.Hobby;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.facades.Facade;
import com.mycompany.ca2.facades.interfaces.IFacade;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.persistence.Persistence;

/**
 *
 * @author lucasmfredmark
 */
public class Test {

    private static final IFacade FACADE = new Facade(Persistence.createEntityManagerFactory("PU"));

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Person person = new Person();
            person.setFirstName("Person " + (i + 1));
            person.setLastName("Person " + (i + 1));

            Hobby hobby = new Hobby();
            hobby.setId(i + 1);
            hobby.setName("Gaming");
            hobby.setDescription("I like to play CS:GO");

            List<Hobby> hobbies = new ArrayList<>();
            hobbies.add(hobby);

            person.setHobbies(hobbies);
            FACADE.addInfoEntity(person);
        }

        for (int i = 5; i < 10; i++) {
            Person person = new Person();
            person.setFirstName("Person " + (i + 1));
            person.setLastName("Person " + (i + 1));

            Hobby hobby = new Hobby();
            hobby.setId(i + 1);
            hobby.setName("Horse riding");
            hobby.setDescription("I like horses");

            List<Hobby> hobbies = new ArrayList<>();
            hobbies.add(hobby);

            person.setHobbies(hobbies);
            FACADE.addInfoEntity(person);
        }
        
        Random r = new Random();
        
        for (int i = 10; i < 20; i++) {
            Company company = new Company();
            company.setName("Company " + (i + 1 - 10));
            company.setDescription("Description " + (i + 1 - 10));
            company.setCvr(String.valueOf(r.nextInt(89999999) + 10000000));
            company.setNumEmployees(String.valueOf(r.nextInt(100)));
            company.setMarketValue(String.valueOf(r.nextInt(10000)));
            
            FACADE.addInfoEntity(company);
        }
    }
}
