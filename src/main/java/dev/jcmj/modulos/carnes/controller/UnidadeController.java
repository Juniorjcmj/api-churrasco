package dev.jcmj.modulos.carnes.controller;


import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dev.jcmj.modulos.carnes.domain.model.Unidade;

@Path(value = "/V1/unidade")
public class UnidadeController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Unidade> fruits() {
        return Unidade.listAll() ;
    }
  
    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newFruit(Unidade a) {  
      
        a.persist();
        return Response.status(Status.CREATED).entity(a).build();
    }
    @Transactional
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(Unidade a) {
        try {          
            Unidade model = Unidade.findById(a.id);
            model.descricao = a.descricao;
            model.persist();
            return Response.status(Status.CREATED).entity(model).build();
            
        } catch (Exception e) {
            return Response.status(Status.NOT_IMPLEMENTED).build();
        }
    }

    @Transactional
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response detete(@QueryParam("id") Long id) {
        try {
            Unidade.deleteById(id);
         return Response.status(Status.OK).build();
            
        } catch (Exception e) {
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
    
}
