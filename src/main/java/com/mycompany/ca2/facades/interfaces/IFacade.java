/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades.interfaces;

import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.Person;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lucasmfredmark
 */
public interface IFacade {
    
    public void addEntityManagerFactory(EntityManagerFactory emf);
    
    /* person methods */
    public List<Person> getAllPersons();
    public Person getPersonById(int personId);
    public List<Person> getPersonsByHobby(String hobby);
    public Person addPerson(Person person);
    public Person editPerson(Person person);
    public Person deletePerson(Person person);
    
    /* company methods */
    public List<Company> getAllCompanies();
    public Company getCompanyById(int companyId);
    public Company getCompanyByCvr(int cvr);
    public Company addCompany(Company company);
    public Company editCompany(Company company);
    public Company deleteCompany(Company company);
    
}
