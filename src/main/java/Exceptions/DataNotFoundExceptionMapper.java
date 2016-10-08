/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import Exceptions.ErrorEntity.ErrorMessage;
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
        ErrorMessage errorMessage = new ErrorMessage(0, ex.getMessage(), 404, "hej");

        return Response.status(Status.NOT_FOUND)
                
                .build();
    }

}
