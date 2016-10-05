/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2;

import com.mycompany.ca2.entities.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author lucasmfredmark
 */
public class Test {
    public static void main(String[] args) {
        Persistence.generateSchema("PU", null);
        
        /*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Person> result = em.createNamedQuery("Person.findByPersonId", Person.class);
            Person p = result.setParameter("personId", 1).getSingleResult();
            
            System.out.println(p.getPersonFirstname());
        } finally {
            em.close();
        }
        */
    }
}
