/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author lucasmfredmark
 */
@Entity
public class Company extends InfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String cvr;
    private String NumEmployees;
    private String marketValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public String getNumEmployees() {
        return NumEmployees;
    }

    public void setNumEmployees(String NumEmployees) {
        this.NumEmployees = NumEmployees;
    }

    public String getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue;
    }

}
