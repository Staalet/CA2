/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades.interfaces;

import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.InfoEntity;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.exceptions.DataNotFoundException;
import java.util.List;

/**
 *
 * @author lucasmfredmark
 */
public interface IFacade {
    
    public InfoEntity addInfoEntity(InfoEntity infoEntity);
    public InfoEntity editInfoEntity(InfoEntity infoEntity) throws DataNotFoundException;
    public InfoEntity deleteInfoEntity(int infoEntityId) throws DataNotFoundException;
    
    /* person methods */
    public List<Person> getAllPersons() throws DataNotFoundException;
    public Person getPersonById(int personId) throws DataNotFoundException;
    public List<Person> getPersonsByHobby(String hobby) throws DataNotFoundException;
    
    /* company methods */
    public List<Company> getAllCompanies() throws DataNotFoundException;
    public Company getCompanyById(int companyId) throws DataNotFoundException;
    public Company getCompanyByCvr(int cvr) throws DataNotFoundException;
    
}
