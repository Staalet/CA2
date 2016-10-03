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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
    @NamedQuery(name = "Company.findByCompanyNumemployees", query = "SELECT c FROM Company c WHERE c.companyNumemployees = :companyNumemployees"),
    @NamedQuery(name = "Company.findByCompanyMarketvalue", query = "SELECT c FROM Company c WHERE c.companyMarketvalue = :companyMarketvalue")})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "company_id")
    private Integer companyId;
    @Size(max = 255)
    @Column(name = "company_name")
    private String companyName;
    @Lob
    @Size(max = 65535)
    @Column(name = "company_desc")
    private String companyDesc;
    @Size(max = 255)
    @Column(name = "company_cvr")
    private String companyCvr;
    @Column(name = "company_numemployees")
    private Integer companyNumemployees;
    @Column(name = "company_marketvalue")
    private Integer companyMarketvalue;
    @JoinColumn(name = "fk_infoentity_id", referencedColumnName = "infoentity_id")
    @ManyToOne
    private Infoentity fkInfoentityId;

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

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public String getCompanyCvr() {
        return companyCvr;
    }

    public void setCompanyCvr(String companyCvr) {
        this.companyCvr = companyCvr;
    }

    public Integer getCompanyNumemployees() {
        return companyNumemployees;
    }

    public void setCompanyNumemployees(Integer companyNumemployees) {
        this.companyNumemployees = companyNumemployees;
    }

    public Integer getCompanyMarketvalue() {
        return companyMarketvalue;
    }

    public void setCompanyMarketvalue(Integer companyMarketvalue) {
        this.companyMarketvalue = companyMarketvalue;
    }

    public Infoentity getFkInfoentityId() {
        return fkInfoentityId;
    }

    public void setFkInfoentityId(Infoentity fkInfoentityId) {
        this.fkInfoentityId = fkInfoentityId;
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
