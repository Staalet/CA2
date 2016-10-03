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
@Table(name = "cityinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cityinfo.findAll", query = "SELECT c FROM Cityinfo c"),
    @NamedQuery(name = "Cityinfo.findByCityinfoId", query = "SELECT c FROM Cityinfo c WHERE c.cityinfoId = :cityinfoId"),
    @NamedQuery(name = "Cityinfo.findByCityinfoZip", query = "SELECT c FROM Cityinfo c WHERE c.cityinfoZip = :cityinfoZip"),
    @NamedQuery(name = "Cityinfo.findByCityinfoCity", query = "SELECT c FROM Cityinfo c WHERE c.cityinfoCity = :cityinfoCity")})
public class Cityinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cityinfo_id")
    private Integer cityinfoId;
    @Column(name = "cityinfo_zip")
    private Integer cityinfoZip;
    @Size(max = 255)
    @Column(name = "cityinfo_city")
    private String cityinfoCity;
    @OneToMany(mappedBy = "fkCityinfoId")
    private Collection<Address> addressCollection;

    public Cityinfo() {
    }

    public Cityinfo(Integer cityinfoId) {
        this.cityinfoId = cityinfoId;
    }

    public Integer getCityinfoId() {
        return cityinfoId;
    }

    public void setCityinfoId(Integer cityinfoId) {
        this.cityinfoId = cityinfoId;
    }

    public Integer getCityinfoZip() {
        return cityinfoZip;
    }

    public void setCityinfoZip(Integer cityinfoZip) {
        this.cityinfoZip = cityinfoZip;
    }

    public String getCityinfoCity() {
        return cityinfoCity;
    }

    public void setCityinfoCity(String cityinfoCity) {
        this.cityinfoCity = cityinfoCity;
    }

    @XmlTransient
    public Collection<Address> getAddressCollection() {
        return addressCollection;
    }

    public void setAddressCollection(Collection<Address> addressCollection) {
        this.addressCollection = addressCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityinfoId != null ? cityinfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cityinfo)) {
            return false;
        }
        Cityinfo other = (Cityinfo) object;
        if ((this.cityinfoId == null && other.cityinfoId != null) || (this.cityinfoId != null && !this.cityinfoId.equals(other.cityinfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ca2.entities.Cityinfo[ cityinfoId=" + cityinfoId + " ]";
    }
    
}
