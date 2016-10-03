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
@Table(name = "person")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p"),
    @NamedQuery(name = "Person.findByPersonId", query = "SELECT p FROM Person p WHERE p.personId = :personId"),
    @NamedQuery(name = "Person.findByPersonFirstname", query = "SELECT p FROM Person p WHERE p.personFirstname = :personFirstname"),
    @NamedQuery(name = "Person.findByPersonLastname", query = "SELECT p FROM Person p WHERE p.personLastname = :personLastname")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "person_id")
    private Integer personId;
    @Size(max = 255)
    @Column(name = "person_firstname")
    private String personFirstname;
    @Size(max = 255)
    @Column(name = "person_lastname")
    private String personLastname;
    @JoinColumn(name = "fk_infoentity_id", referencedColumnName = "infoentity_id")
    @ManyToOne
    private Infoentity fkInfoentityId;
    @OneToMany(mappedBy = "fkPersonId")
    private Collection<Hobbyperson> hobbypersonCollection;

    public Person() {
    }

    public Person(Integer personId) {
        this.personId = personId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonFirstname() {
        return personFirstname;
    }

    public void setPersonFirstname(String personFirstname) {
        this.personFirstname = personFirstname;
    }

    public String getPersonLastname() {
        return personLastname;
    }

    public void setPersonLastname(String personLastname) {
        this.personLastname = personLastname;
    }

    public Infoentity getFkInfoentityId() {
        return fkInfoentityId;
    }

    public void setFkInfoentityId(Infoentity fkInfoentityId) {
        this.fkInfoentityId = fkInfoentityId;
    }

    @XmlTransient
    public Collection<Hobbyperson> getHobbypersonCollection() {
        return hobbypersonCollection;
    }

    public void setHobbypersonCollection(Collection<Hobbyperson> hobbypersonCollection) {
        this.hobbypersonCollection = hobbypersonCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personId != null ? personId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.personId == null && other.personId != null) || (this.personId != null && !this.personId.equals(other.personId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ca2.entities.Person[ personId=" + personId + " ]";
    }
    
}
