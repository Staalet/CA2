/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.facades.Facade;
import com.mycompany.ca2.facades.interfaces.IFacade;
import java.util.List;
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
 * @author Staal
 */
@Path("person")
public class PersonResource {

    @Context
    private UriInfo context;
    
    private final IFacade facade;
    private final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Creates a new instance of PersonResource
     */
    public PersonResource() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        facade = new Facade(emf);
    }

    /**
     * Retrieves representation of an instance of com.mycompany.ca2.PersonResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
    @GET
    @Path("complete")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllPersons() {
        List<Person> people = facade.getAllPersons();
        
        return GSON.toJson(people);
    }

    /**
     * PUT method for updating or creating an instance of PersonResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
