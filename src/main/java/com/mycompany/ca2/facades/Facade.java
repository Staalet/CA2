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
            TypedQuery<Person> persons = em.createQuery("SELECT p FROM Person p", Person.class);

            return persons.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Person getPersonById(int personId) {
        EntityManager em = emf.createEntityManager();

        try {
            return em.find(Person.class, personId);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Person> getPersonsByHobby(String hobby) {
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Person> personsHobby = em.createQuery("SELECT p FROM Person p JOIN p.hobbies h WHERE h.name = :hobbyName", Person.class);
            personsHobby.setParameter("hobbyName", hobby);

            return personsHobby.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Person addPerson(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person editPerson(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person deletePerson(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Company> getAllCompanies() {
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Company> companies = em.createQuery("SELECT c FROM Company c", Company.class);

            return companies.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public Company getCompanyById(int companyId) {
        EntityManager em = emf.createEntityManager();

        try {
            return em.find(Company.class, companyId);
        } finally {
            em.close();
        }
    }

    @Override
    public Company getCompanyByCvr(int cvr) {
        EntityManager em = emf.createEntityManager();
        
        try {
            TypedQuery<Company> company = em.createQuery("SELECT c FROM Company c WHERE c.cvr = :companyCvr", Company.class);
            company.setParameter("companyCvr", cvr);
            
            return company.getSingleResult();
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
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.find(Company.class, company);
            em.remove(company);
            em.getTransaction().commit();
            return company;
        } finally {
            em.close();
        }

    }
}
