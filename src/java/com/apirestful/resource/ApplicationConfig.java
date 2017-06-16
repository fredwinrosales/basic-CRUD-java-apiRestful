package com.apirestful.resource;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author frosales <fredwinrosales@gmail.com>
 */
@javax.ws.rs.ApplicationPath("1.0")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.apirestful.resource.AlumnoResource.class);
    }
    
}
