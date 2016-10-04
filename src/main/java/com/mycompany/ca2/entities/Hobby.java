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
@Table(name = "hobby")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hobby.findAll", query = "SELECT h FROM Hobby h"),
    @NamedQuery(name = "Hobby.findByHobbyId", query = "SELECT h FROM Hobby h WHERE h.hobbyId = :hobbyId"),
    @NamedQuery(name = "Hobby.findByHobbyName", query = "SELECT h FROM Hobby h WHERE h.hobbyName = :hobbyName"),
    @NamedQuery(name = "Hobby.findByHobbyDesc", query = "SELECT h FROM Hobby h WHERE h.hobbyDesc = :hobbyDesc")})
public class Hobby implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hobby_id")
    private Integer hobbyId;
    @Size(max = 255)
    @Column(name = "hobby_name")
    private String hobbyName;
    @Size(max = 255)
    @Column(name = "hobby_desc")
    private String hobbyDesc;
    @OneToMany(mappedBy = "fkHobbyId")
    private Collection<Hobbyperson> hobbypersonCollection;

    public Hobby() {
    }

    public Hobby(Integer hobbyId) {
        this.hobbyId = hobbyId;
    }

    public Integer getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(Integer hobbyId) {
        this.hobbyId = hobbyId;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getHobbyDesc() {
        return hobbyDesc;
    }

    public void setHobbyDesc(String hobbyDesc) {
        this.hobbyDesc = hobbyDesc;
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
        hash += (hobbyId != null ? hobbyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hobby)) {
            return false;
        }
        Hobby other = (Hobby) object;
        if ((this.hobbyId == null && other.hobbyId != null) || (this.hobbyId != null && !this.hobbyId.equals(other.hobbyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ca2.entities.Hobby[ hobbyId=" + hobbyId + " ]";
    }
    
}
