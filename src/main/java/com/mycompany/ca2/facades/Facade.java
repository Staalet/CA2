/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades;

import Exceptions.DataNotFoundException;
import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.InfoEntity;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.facades.interfaces.IFacade;
import groovy.json.JsonException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            InfoEntity entity = em.merge((Person) infoEntity);
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
    public Company getCompanyById(int companyId) throws DataNotFoundException {
        EntityManager em = emf.createEntityManager();
        Company companyid = em.find(Company.class, companyId);

        try {
            if (companyid == null) {
                throw new DataNotFoundException("CompanyID " + companyId + " notFound");
            }
        } finally {
            em.close();
        }

        return companyid;
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

}
