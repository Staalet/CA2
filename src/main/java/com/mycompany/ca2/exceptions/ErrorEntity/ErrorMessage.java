/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.exceptions.ErrorEntity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Staal
 */
@XmlRootElement
@Entity
//mabye @Entity
public class ErrorMessage implements Serializable {

   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String errorMessage;
    private int errorCode;
    private String documentation;

    public ErrorMessage() {
    }

    public ErrorMessage(Integer id, String documentation, int errorCode, String errorMessage) {
        this.id = id;
        this.documentation = documentation;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * @return the ErrorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param ErrorMessage the ErrorMessage to set
     */
    public void setErrorMessage(String ErrorMessage) {
        this.errorMessage = ErrorMessage;
    }

    /**
     * @return the errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return the Documentation
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * @param Documentation the Documentation to set
     */
    public void setDocumentation(String Documentation) {
        this.documentation = Documentation;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
