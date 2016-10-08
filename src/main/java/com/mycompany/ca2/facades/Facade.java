/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades;

import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.InfoEntity;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.exceptions.CompanyNotFoundException;
import com.mycompany.ca2.exceptions.PersonNotFoundException;
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
    public InfoEntity addInfoEntity(InfoEntity infoEntity) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(infoEntity);
            em.getTransaction().commit();
            
            return infoEntity;
        } finally {
            em.close();
        }
    }

    @Override
    public InfoEntity editInfoEntity(int infoEntityId, InfoEntity infoEntity) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.find(infoEntity.getClass(), infoEntityId);
            InfoEntity entity = em.merge(infoEntity);
            em.getTransaction().commit();
            
            return entity;
        } finally {
            em.close();
        }
    }

    @Override
    public InfoEntity deleteInfoEntity(int infoEntityId) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            InfoEntity entity = em.find(InfoEntity.class, infoEntityId);
            em.remove(entity);
            em.getTransaction().commit();
            
            return entity;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Person> getAllPersons() throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Person> persons = em.createQuery("SELECT p FROM Person p", Person.class);
            List<Person> p = persons.getResultList();
            
            if (p == null) {
                throw new PersonNotFoundException("No persons were found.");
            }
            
            return p;
        } finally {
            em.close();
        }
    }

    @Override
    public Person getPersonById(int personId) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();

        try {
            Person p = em.find(Person.class, personId);
            
            if (p == null) {
                throw new PersonNotFoundException("Person with ID " + personId + " not found.");
            }
            
            return p;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Person> getPersonsByHobby(String hobby) throws PersonNotFoundException {
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Person> personsHobby = em.createQuery("SELECT p FROM Person p JOIN p.hobbies h WHERE h.name = :hobbyName", Person.class);
            personsHobby.setParameter("hobbyName", hobby);
            
            List<Person> p = personsHobby.getResultList();
            
            if (p == null) {
                throw new PersonNotFoundException("No persons with hobby " + hobby + " found.");
            }
            
            return p;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Company> getAllCompanies() throws CompanyNotFoundException {
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Company> companies = em.createQuery("SELECT c FROM Company c", Company.class);
            List<Company> c = companies.getResultList();
            
            if (c == null) {
                throw new CompanyNotFoundException("No companies were found.");
            }
            
            return c;
        } finally {
            em.close();
        }
    }

    @Override
    public Company getCompanyById(int companyId) throws CompanyNotFoundException {
        EntityManager em = emf.createEntityManager();
        
        try {
            Company company = em.find(Company.class, companyId);
            
            if (company == null) {
                throw new CompanyNotFoundException("Company with ID " + companyId + " not found.");
            }
            
            return company;
        } finally {
            em.close();
        }
    }

    @Override
    public Company getCompanyByCvr(int cvr) throws CompanyNotFoundException {
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Company> company = em.createQuery("SELECT c FROM Company c WHERE c.cvr = :companyCvr", Company.class);
            company.setParameter("companyCvr", cvr);
            
            Company c = company.getSingleResult();
            
            if (c == null) {
                throw new CompanyNotFoundException("Company with CVR " + cvr + " not found.");
            }
            
            return c;
        } finally {
            em.close();
        }
    }

}
