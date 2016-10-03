/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lucasmfredmark
 */
@Entity
@Table(name = "infoentity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Infoentity.findAll", query = "SELECT i FROM Infoentity i"),
    @NamedQuery(name = "Infoentity.findByInfoentityId", query = "SELECT i FROM Infoentity i WHERE i.infoentityId = :infoentityId"),
    @NamedQuery(name = "Infoentity.findByInfoentityEmail", query = "SELECT i FROM Infoentity i WHERE i.infoentityEmail = :infoentityEmail")})
public class Infoentity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "infoentity_id")
    private Integer infoentityId;
    @Size(max = 255)
    @Column(name = "infoentity_email")
    private String infoentityEmail;
    @JoinColumn(name = "fk_address_id", referencedColumnName = "address_id")
    @ManyToOne
    private Address fkAddressId;
    @OneToMany(mappedBy = "fkInfoentityId")
    private Collection<Phone> phoneCollection;
    @OneToMany(mappedBy = "fkInfoentityId")
    private Collection<Person> personCollection;
    @OneToMany(mappedBy = "fkInfoentityId")
    private Collection<Company> companyCollection;

    public Infoentity() {
    }

    public Infoentity(Integer infoentityId) {
        this.infoentityId = infoentityId;
    }

    public Integer getInfoentityId() {
        return infoentityId;
    }

    public void setInfoentityId(Integer infoentityId) {
        this.infoentityId = infoentityId;
    }

    public String getInfoentityEmail() {
        return infoentityEmail;
    }

    public void setInfoentityEmail(String infoentityEmail) {
        this.infoentityEmail = infoentityEmail;
    }

    public Address getFkAddressId() {
        return fkAddressId;
    }

    public void setFkAddressId(Address fkAddressId) {
        this.fkAddressId = fkAddressId;
    }

    @XmlTransient
    public Collection<Phone> getPhoneCollection() {
        return phoneCollection;
    }

    public void setPhoneCollection(Collection<Phone> phoneCollection) {
        this.phoneCollection = phoneCollection;
    }

    @XmlTransient
    public Collection<Person> getPersonCollection() {
        return personCollection;
    }

    public void setPersonCollection(Collection<Person> personCollection) {
        this.personCollection = personCollection;
    }

    @XmlTransient
    public Collection<Company> getCompanyCollection() {
        return companyCollection;
    }

    public void setCompanyCollection(Collection<Company> companyCollection) {
        this.companyCollection = companyCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infoentityId != null ? infoentityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Infoentity)) {
            return false;
        }
        Infoentity other = (Infoentity) object;
        if ((this.infoentityId == null && other.infoentityId != null) || (this.infoentityId != null && !this.infoentityId.equals(other.infoentityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ca2.entities.Infoentity[ infoentityId=" + infoentityId + " ]";
    }
    
}
