package com.apirestful.resource;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * Entidad Alumno
 *
 * @author frosales <fredwinrosales@gmail.com>
 */
@Path("alumno")
public class AlumnoResource {

    @Context
    private UriInfo context;
    
    public AlumnoResource() {
    }
    
    @POST
    @Produces("application/json")
    public String postAlumno() {
        
        return "postAlumno";
    }
    
    @GET
    @Produces("application/json")
    public String getAlumno() {
        
        return "getAlumno";
    }
    
    @PUT
    @Consumes("application/json")
    public String putAlumno(String content) {
        
        return "putAlumno";
    }
    
    @DELETE
    @Consumes("application/json")
    public String deleteAlumno(String content) {
        
        return "deleteAlumno";
    }
}
