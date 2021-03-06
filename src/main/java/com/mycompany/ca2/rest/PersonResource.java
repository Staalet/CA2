/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.ca2.entities.Person;
import com.mycompany.ca2.exceptions.DataNotFoundException;
import com.mycompany.ca2.facades.Facade;
import com.mycompany.ca2.facades.interfaces.IFacade;
import java.util.List;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
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
    
    private static final IFacade FACADE = new Facade(Persistence.createEntityManagerFactory("PU"));
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Creates a new instance of PersonResource
     */
    public PersonResource() {
    }
    
    @PUT
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addPerson(String jsonPerson) {
        Person person = GSON.fromJson(jsonPerson, Person.class);
        Person p = (Person) FACADE.addInfoEntity(person);
        
        return GSON.toJson(p);
    }
    
    @POST
    @Path("edit")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editPerson(String jsonPerson) throws DataNotFoundException {
        Person person = GSON.fromJson(jsonPerson, Person.class);
        Person p = (Person) FACADE.editInfoEntity(person);
        
        return GSON.toJson(p);
    }
    
    @DELETE
    @Path("delete/{id: \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deletePerson(@PathParam("id") int id) throws DataNotFoundException {
        Person person = (Person) FACADE.deleteInfoEntity(id);
        
        return GSON.toJson(person);
    }
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllPersons() throws DataNotFoundException {
        List<Person> people = FACADE.getAllPersons();
        
        return GSON.toJson(people);
    }
    
    @GET
    @Path("id/{id: \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonById(@PathParam("id") int id) throws DataNotFoundException {
        Person person = FACADE.getPersonById(id);
        
        return GSON.toJson(person);
    }
    
    @GET
    @Path("hobby/{hobby}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonsByHobby(@PathParam("hobby") String hobby) throws DataNotFoundException {
        List<Person> people = FACADE.getPersonsByHobby(hobby);
        
        return GSON.toJson(people);
    }
}
