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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company getCompanyById(int companyId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company getCompanyByCvr(int cvr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Company addCompany(Company company) {
        EntityManager em = emf.createEntityManager();

        try {
            Company c = new Company();
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            return c;
        } finally {
            em.close();
            
        }
    }

    @Override
    public Company editCompany(Company company) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Company> result = em.createNamedQuery("Company.findByCompanyId", Company.class);
            Company c = result.setParameter("companyId", company.getCompanyId()).getSingleResult();
            
            //Have not set company Id so you cant ruin unique id
            em.getTransaction().begin();
            c.setCompanyCvr(company.getCompanyCvr());
            c.setCompanyDesc(company.getCompanyDesc());
            c.setCompanyEmpl(company.getCompanyEmpl());
            c.setCompanyName(company.getCompanyName());
            c.setCompanyValue(company.getCompanyValue());
            em.getTransaction().commit();
            
            return company;
            
        }finally {
            em.close();
        }
    }
    @Override
    public Company deleteCompany(Company company) {
        EntityManager em = emf.createEntityManager();
        try {

            TypedQuery<Company> result = em.createNamedQuery("Company.findByCompanyId", Company.class);
            Company c = result.setParameter("companyId", company.getCompanyId()).getSingleResult();

            em.remove(c);

            return company;
        } finally {
            em.close();
        }
    }

}
