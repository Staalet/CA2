/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.facades;

import com.mycompany.ca2.facades.interfaces.IFacade;
import com.mycompany.ca2.entities.Cityinfo;
import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.entities.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

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
    public Person getPersonByPhoneNumber(int phoneNumber) {
        EntityManager em = emf.createEntityManager();
        
        try {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public Company getCompanyByPhoneNumber(int phoneNumber) {
        return null;
    }

    @Override
    public Company getCompanyByCVR(int cvr) {
        return null;
    }

    @Override
    public List<Person> getPersonsWithHobby(String hobby) {
        return null;
    }

    @Override
    public List<Person> getAllPersonsByZipCode(int zip) {
        return null;
    }

    @Override
    public List<Cityinfo> getAllZipCodesInCountry(String country) {
        return null;
    }

    @Override
    public List<Company> getCompaniesWithEmployeeCountOverX(int x) {
        return null;
    }

    @Override
    public void addAdress() {

    }

    @Override
    public void deleteAdress() {

    }

    @Override
    public void editAdress() {

    }

    @Override
    public void addCityInfo() {

    }

    @Override
    public void deleteCityInfo() {

    }

    @Override
    public void editCityInfo() {

    }

    @Override
    public void addCompany() {

    }

    @Override
    public void deleteCompany() {

    }

    @Override
    public void editCompany() {

    }

    @Override
    public void addHobby() {

    }

    @Override
    public void deleteHobby() {

    }

    @Override
    public void editHobby() {

    }

    @Override
    public void addHobbyPerson() {

    }

    @Override
    public void deleteHobbyPerson() {

    }

    @Override
    public void editHobbyPerson() {

    }

    @Override
    public void addInfoentity() {

    }

    @Override
    public void deleteInfoentity() {

    }

    @Override
    public void editInfoentity() {

    }

    @Override
    public void addPerson() {

    }

    @Override
    public void deletePerson() {

    }

    @Override
    public void editPerson() {

    }

    @Override
    public void addPhone() {
    }

    @Override
    public void deletePhone() {

    }

    @Override
    public void editPhone() {

    }

}
