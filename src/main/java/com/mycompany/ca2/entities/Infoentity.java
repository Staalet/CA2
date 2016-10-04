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
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "typeof")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Infoentity.findAll", query = "SELECT i FROM Infoentity i"),
    @NamedQuery(name = "Infoentity.findByEntityId", query = "SELECT i FROM Infoentity i WHERE i.entityId = :entityId"),
    @NamedQuery(name = "Infoentity.findByEntityEmail", query = "SELECT i FROM Infoentity i WHERE i.entityEmail = :entityEmail"),
    @NamedQuery(name = "Infoentity.findByEntityTypeof", query = "SELECT i FROM Infoentity i WHERE i.entityTypeof = :entityTypeof")})
public class Infoentity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entity_id")
    private Integer entityId;
    @Size(max = 255)
    @Column(name = "entity_email")
    private String entityEmail;
    @Size(max = 20)
    @Column(name = "entity_typeof")
    private String entityTypeof;
    @JoinColumn(name = "fk_address_id", referencedColumnName = "address_id")
    @ManyToOne
    private Address fkAddressId;
    @OneToMany(mappedBy = "fkEntityId")
    private Collection<Phone> phoneCollection;

    public Infoentity() {
    }

    public Infoentity(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public String getEntityEmail() {
        return entityEmail;
    }

    public void setEntityEmail(String entityEmail) {
        this.entityEmail = entityEmail;
    }

    public String getEntityTypeof() {
        return entityTypeof;
    }

    public void setEntityTypeof(String entityTypeof) {
        this.entityTypeof = entityTypeof;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityId != null ? entityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Infoentity)) {
            return false;
        }
        Infoentity other = (Infoentity) object;
        if ((this.entityId == null && other.entityId != null) || (this.entityId != null && !this.entityId.equals(other.entityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ca2.entities.Infoentity[ entityId=" + entityId + " ]";
    }
    
}
