/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades.interfaces;

import com.mycompany.ca2.entities.Cityinfo;
import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.Person;
import java.util.List;

/**
 *
 * @author lucasmfredmark
 */
public interface IFacade {

    public void addAdress();

    public void addCityInfo();

    public void addCompany();

    public void addHobby();

    public void addHobbyPerson();

    public void addInfoentity();

    public void addPerson();

    public void addPhone();

    public void deleteAdress();

    public void deleteCityInfo();

    public void deleteCompany();

    public void deleteHobby();

    public void deleteHobbyPerson();

    public void deleteInfoentity();

    public void deletePerson();

    public void deletePhone();

    public void editAdress();

    public void editCityInfo();

    public void editCompany();

    public void editHobby();

    public void editHobbyPerson();

    public void editInfoentity();

    public void editPerson();

    public void editPhone();

    public List<Person> getAllPersonsByZipCode(int zip);

    public List<Cityinfo> getAllZipCodesInCountry(String country);

    public List<Company> getCompaniesWithEmployeeCountOverX(int x);

    public Company getCompanyByCVR(int cvr);

    public Company getCompanyByPhoneNumber(int phoneNumber);

    public Person getPersonByPhoneNumber(int phoneNumber);

    public List<Person> getPersonsWithHobby(String hobby);
    
}
