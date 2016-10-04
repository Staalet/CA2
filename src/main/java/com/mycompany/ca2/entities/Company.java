/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucasmfredmark
 */
@Entity
@Table(name = "company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "Company.findByCompanyId", query = "SELECT c FROM Company c WHERE c.companyId = :companyId"),
    @NamedQuery(name = "Company.findByCompanyName", query = "SELECT c FROM Company c WHERE c.companyName = :companyName"),
    @NamedQuery(name = "Company.findByCompanyCvr", query = "SELECT c FROM Company c WHERE c.companyCvr = :companyCvr"),
    @NamedQuery(name = "Company.findByCompanyDesc", query = "SELECT c FROM Company c WHERE c.companyDesc = :companyDesc"),
    @NamedQuery(name = "Company.findByCompanyEmpl", query = "SELECT c FROM Company c WHERE c.companyEmpl = :companyEmpl"),
    @NamedQuery(name = "Company.findByCompanyValue", query = "SELECT c FROM Company c WHERE c.companyValue = :companyValue")})
public class Company extends Infoentity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "company_id")
    private Integer companyId;
    @Size(max = 255)
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "company_cvr")
    private Integer companyCvr;
    @Size(max = 255)
    @Column(name = "company_desc")
    private String companyDesc;
    @Column(name = "company_empl")
    private Integer companyEmpl;
    @Column(name = "company_value")
    private Integer companyValue;

    public Company() {
    }

    public Company(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getCompanyCvr() {
        return companyCvr;
    }

    public void setCompanyCvr(Integer companyCvr) {
        this.companyCvr = companyCvr;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public Integer getCompanyEmpl() {
        return companyEmpl;
    }

    public void setCompanyEmpl(Integer companyEmpl) {
        this.companyEmpl = companyEmpl;
    }

    public Integer getCompanyValue() {
        return companyValue;
    }

    public void setCompanyValue(Integer companyValue) {
        this.companyValue = companyValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyId != null ? companyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyId == null && other.companyId != null) || (this.companyId != null && !this.companyId.equals(other.companyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ca2.entities.Company[ companyId=" + companyId + " ]";
    }
    
}
