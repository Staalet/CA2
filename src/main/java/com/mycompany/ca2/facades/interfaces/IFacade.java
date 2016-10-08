/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades.interfaces;

import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.InfoEntity;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.exceptions.CompanyNotFoundException;
import com.mycompany.ca2.exceptions.PersonNotFoundException;
import java.util.List;

/**
 *
 * @author lucasmfredmark
 */
public interface IFacade {
    
    public InfoEntity addInfoEntity(InfoEntity infoEntity);
    public InfoEntity editInfoEntity(int infoEntityId, InfoEntity infoEntity);
    public InfoEntity deleteInfoEntity(int infoEntityId);
    
    /* person methods */
    public List<Person> getAllPersons() throws PersonNotFoundException;
    public Person getPersonById(int personId) throws PersonNotFoundException;
    public List<Person> getPersonsByHobby(String hobby) throws PersonNotFoundException;
    
    /* company methods */
    public List<Company> getAllCompanies() throws CompanyNotFoundException;
    public Company getCompanyById(int companyId) throws CompanyNotFoundException;
    public Company getCompanyByCvr(int cvr) throws CompanyNotFoundException;
    
}
