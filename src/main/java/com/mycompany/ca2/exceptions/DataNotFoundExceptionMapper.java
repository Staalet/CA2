/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.exceptions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author lucasmfredmark
 */
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

    private final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    
    @Context
    ServletContext context;
    
    @Override
    public Response toResponse(DataNotFoundException exception) {
        boolean isDebug = context.getInitParameter("debug").equals("true");
        ErrorMessage error = new ErrorMessage(404, exception, isDebug);
        
        return Response.status(404)
                .entity(GSON.toJson(error))
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    
}
