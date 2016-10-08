/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades.interfaces;

import com.mycompany.ca2.exceptions.DataNotFoundException;
import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.InfoEntity;
import com.mycompany.ca2.entities.Person;
import groovy.json.JsonException;
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
    public List<Person> getAllPersons();
    public Person getPersonById(int personId);
    public List<Person> getPersonsByHobby(String hobby);
    
    /* company methods */
    public List<Company> getAllCompanies();
    public Company getCompanyById(int companyId)throws DataNotFoundException;
    public Company getCompanyByCvr(int cvr);
    
}
