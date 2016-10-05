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
import javax.persistence.TypedQuery;

/**
 *
 * @author lucasmfredmark
 */
public class Facade implements IFacade {
    private final EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Person> getAllPersons() {
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Person> result = em.createNamedQuery("Person.findAll", Person.class);
            List<Person> persons = result.getResultList();
            
            return persons;
        } finally {
            em.close();
        }
    }

    @Override
    public Person getPersonById(int personId) {
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Person> result = em.createNamedQuery("Person.findByPersonId", Person.class);
            Person p = result.setParameter("personId", personId).getSingleResult();
            
            return p;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Person> getPersonsByHobby(String hobby) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person addPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
            
            return person;
        } finally {
            em.close();
        }
    }

    @Override
    public Person editPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Person> result = em.createNamedQuery("Person.findByPersonId", Person.class);
            Person p = result.setParameter("personId", person.getPersonId()).getSingleResult();
            
            em.getTransaction().begin();
            p.setPersonId(person.getPersonId());
            p.setPersonFirstname(person.getPersonFirstname());
            p.setPersonLastname(person.getPersonLastname());
            em.getTransaction().commit();
            
            return person;
        } finally {
            em.close();
        }
    }

    @Override
    public Person deletePerson(Person person) {
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Person> result = em.createNamedQuery("Person.findByPersonId", Person.class);
            Person p = result.setParameter("personId", person.getPersonId()).getSingleResult();
            
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            
            return p;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Company> getAllCompanies() {
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Company> result = em.createNamedQuery("Company.findAll", Company.class);
            List<Company> companies = result.getResultList();
            
            return companies;
        } finally {
            em.close();
        }
    }

    @Override
    public Company getCompanyById(int companyId) {
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Company> result = em.createNamedQuery("Company.findByCompanyId", Company.class);
            Company c = result.setParameter("company_id", companyId).getSingleResult();
            
            return c;
        } finally {
            em.close();
        }
    }

    @Override
    public Company getCompanyByCvr(int cvr) {
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Company> result = em.createNamedQuery("Company.findByCompanyCvr", Company.class);
            Company c = result.setParameter("company_cvr", cvr).getSingleResult();
            
            return c;
        } finally {
            em.close();
        }
    }

    @Override
    public Company addCompany(Company company) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company editCompany(Company company) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company deleteCompany(Company company) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
