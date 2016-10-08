/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.exceptions;


import com.mycompany.ca2.exceptions.ErrorEntity.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Staal
 */
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

    @Override
    public Response toResponse(DataNotFoundException ex) {
        
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setId(Integer.SIZE);
        errorMessage.setDocumentation("sd");
        errorMessage.setErrorCode(500);
        errorMessage.setErrorMessage("lol");
        return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();          
    }

}
