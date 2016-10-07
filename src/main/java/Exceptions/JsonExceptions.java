/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Staal
 */
public class JsonExceptions extends Exception {

    /**
     * Creates a new instance of <code>JsonExceptions</code> without detail message.
     */
    public JsonExceptions() {
    }

    /**
     * Constructs an instance of <code>JsonExceptions</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    
    public JsonExceptions(String msg) {
        super(msg);
    }
}
