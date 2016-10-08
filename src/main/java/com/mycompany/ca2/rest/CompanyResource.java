/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.rest;

import com.mycompany.ca2.exceptions.DataNotFoundException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.facades.Facade;
import com.mycompany.ca2.facades.interfaces.IFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author lucasmfredmark
 */
@Path("company")
public class CompanyResource {

    @Context
    private UriInfo context;

    private final static IFacade FACADE = new Facade(Persistence.createEntityManagerFactory("PU"));
    private final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Creates a new instance of CompanyResource
     */
    public CompanyResource() {
    }
    
    @PUT
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addCompany(String JsonCompany) {
        Company company = GSON.fromJson(JsonCompany, Company.class);
        Company c = (Company) FACADE.addInfoEntity(company);
        
        return GSON.toJson(c);
    }

    @POST
    @Path("edit/{id: \\d+}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String editCompany(@PathParam("id") int id, String jsonCompany) {
        Company company = GSON.fromJson(jsonCompany, Company.class);
        Company c = (Company) FACADE.editInfoEntity(id, company);
        
        return GSON.toJson(c);
    }

    @DELETE
    @Path("delete/{id: \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteCompany(@PathParam("id") int id) {
        Company company = (Company) FACADE.deleteInfoEntity(id);
        
        return GSON.toJson(company);
    }
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllCompanies() {
        List<Company> companies = FACADE.getAllCompanies();
        
        return GSON.toJson(companies);
    }

    @GET
    @Path("id/{id: \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompanyById(@PathParam("id") int id) {
        try {
            Company company = FACADE.getCompanyById(id);
            
            return GSON.toJson(company);
        } catch (DataNotFoundException ex) {
            return GSON.toJson(ex.getMessage());
        }
    }

    @GET
    @Path("cvr/{cvr: \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompanyByCvr(@PathParam("cvr") int cvr) {
        Company company = FACADE.getCompanyByCvr(cvr);
        
        return GSON.toJson(company);
    }
}
