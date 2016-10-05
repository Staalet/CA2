/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.ca2.facades.Facade;
import com.mycompany.ca2.facades.interfaces.IFacade;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author lucasmfredmark
 */
@Path("company")
public class CompanyResource {

    @Context
    private UriInfo context;
    
    //private final static IFacade FACADE = new Facade(Persistence.createEntityManagerFactory("PU"));
    private final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Creates a new instance of CompanyResource
     */
    public CompanyResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.ca2.rest.CompanyResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of CompanyResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
