package dev.jcmj.modulos.acompanhamento.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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
    public Response newFruit(TipoAcompanhamento a) {
        a.id = null;
        a.persist();
        return Response.status(Status.CREATED).entity(a).build();
    }
}
