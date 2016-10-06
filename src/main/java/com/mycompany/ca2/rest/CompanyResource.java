/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.ca2.entities.Company;
import com.mycompany.ca2.facades.Facade;
import com.mycompany.ca2.facades.interfaces.IFacade;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.DELETE;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import static org.glassfish.jersey.server.model.Parameter.Source.PATH;

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

    /**
     * Retrieves representation of an instance of
     * com.mycompany.ca2.rest.CompanyResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllCompanies() {
        List<Company> companies = FACADE.getAllCompanies();

        return GSON.toJson(companies);
    }

    @GET
    @Path("{id: \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompanyId(@PathParam("id") int id) {
        Company company = FACADE.getCompanyById(id);

        return GSON.toJson(company);
    }

    @GET
    @Path("{cvr: \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompanyCvr(@PathParam("cvr") int cvr) {
        Company company = FACADE.getCompanyByCvr(cvr);
        return GSON.toJson(company);
    }

    @PUT
    @Path("add")
    @Consumes
    @Produces(MediaType.APPLICATION_JSON)
    public String addCompany(String JsonCompany) {
        Company company = GSON.fromJson(JsonCompany, Company.class);
        Company c = (Company) FACADE.addInfoEntity(company);
        return GSON.toJson(c);
    }

    @POST
    @Path("edit")
    @Consumes
    @Produces(MediaType.APPLICATION_JSON)
    public String editCompany(@PathParam("id") int id, String JsonCompany) {
        Company company = GSON.fromJson(JsonCompany, Company.class);
        Company c = (Company) FACADE.addInfoEntity(company);
        return GSON.toJson(c);
    }
    
    @DELETE
    @Path("delete")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteCompany(@PathParam("id") int id){
        Company company = (Company) FACADE.deleteInfoEntity(id);
        
        return GSON.toJson(company);
        
    }

    /**
     * PUT method for updating or creating an instance of CompanyResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
