/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author lucasmfredmark
 */
public class ErrorMessage {
    private int code;
    private String message;
    private String stackTrace;

    public ErrorMessage(int code, Throwable ex, boolean debug) {
        this.code = code;
        this.message = ex.getMessage();
        
        if (debug) {
            StringWriter sw = new StringWriter();
            ex.printStackTrace(new PrintWriter(sw));
            this.stackTrace = sw.toString();
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
}
