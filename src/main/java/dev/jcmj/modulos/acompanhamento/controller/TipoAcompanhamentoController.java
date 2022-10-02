package dev.jcmj.modulos.acompanhamento.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
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

import org.jboss.resteasy.core.ExceptionHandler;
import org.jboss.resteasy.spi.UnhandledException;

import dev.jcmj.modulos.acompanhamento.domain.model.TipoAcompanhamento;

@Path("/V1/tipo-acompanhamento")
public class TipoAcompanhamentoController {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TipoAcompanhamento> fruits() {
        return TipoAcompanhamento.listAll();
    }
   

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newFruit(@Valid TipoAcompanhamento a) {
        try {
            a.id = null;
            a.persist();
            return Response.status(Status.CREATED).entity(a).build();
            
        } catch (Exception e) {
            return Response.status(Status.NOT_IMPLEMENTED).entity(e.getMessage()).build();
        }
    }

    @Transactional
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAcompanhamento(@Valid TipoAcompanhamento a) {

        try {
            TipoAcompanhamento model = TipoAcompanhamento.findById(a.id);
            model.descricao = a.descricao;
            model.persist();
            return Response.status(Status.CREATED).entity(a).build();
            
        } catch (Exception e) {
            return Response.status(Status.NOT_IMPLEMENTED).entity(e.getMessage()).build();
        }
    }

    @Transactional
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAcompanhamento(@QueryParam("id") Long id) {
        try {
            TipoAcompanhamento.deleteById(id);
            return Response.status(Status.OK).build();
               
           } catch (Exception e) {
               return Response.status(Status.BAD_REQUEST).entity(e.getStackTrace()).build();
           }
    }
}
