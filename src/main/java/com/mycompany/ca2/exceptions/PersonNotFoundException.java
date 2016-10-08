/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.exceptions;

/**
 *
 * @author Staal
 */
public class PersonNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>DataNotFoundException</code> without
     * detail message.
     */
    public PersonNotFoundException() {
    }

    /**
     * Constructs an instance of <code>DataNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PersonNotFoundException(String msg) {
        super(msg);
    }
}
