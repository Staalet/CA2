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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucasmfredmark
 */
@Entity
@Table(name = "hobbyperson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hobbyperson.findAll", query = "SELECT h FROM Hobbyperson h"),
    @NamedQuery(name = "Hobbyperson.findByHobbypersonId", query = "SELECT h FROM Hobbyperson h WHERE h.hobbypersonId = :hobbypersonId")})
public class Hobbyperson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hobbyperson_id")
    private Integer hobbypersonId;
    @JoinColumn(name = "fk_hobby_id", referencedColumnName = "hobby_id")
    @ManyToOne
    private Hobby fkHobbyId;
    @JoinColumn(name = "fk_person_id", referencedColumnName = "person_id")
    @ManyToOne
    private Person fkPersonId;

    public Hobbyperson() {
    }

    public Hobbyperson(Integer hobbypersonId) {
        this.hobbypersonId = hobbypersonId;
    }

    public Integer getHobbypersonId() {
        return hobbypersonId;
    }

    public void setHobbypersonId(Integer hobbypersonId) {
        this.hobbypersonId = hobbypersonId;
    }

    public Hobby getFkHobbyId() {
        return fkHobbyId;
    }

    public void setFkHobbyId(Hobby fkHobbyId) {
        this.fkHobbyId = fkHobbyId;
    }

    public Person getFkPersonId() {
        return fkPersonId;
    }

    public void setFkPersonId(Person fkPersonId) {
        this.fkPersonId = fkPersonId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hobbypersonId != null ? hobbypersonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hobbyperson)) {
            return false;
        }
        Hobbyperson other = (Hobbyperson) object;
        if ((this.hobbypersonId == null && other.hobbypersonId != null) || (this.hobbypersonId != null && !this.hobbypersonId.equals(other.hobbypersonId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ca2.entities.Hobbyperson[ hobbypersonId=" + hobbypersonId + " ]";
    }
    
}
