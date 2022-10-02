package dev.jcmj.modulos.bebidas.controller;

import java.util.List;

import javax.inject.Inject;
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

import dev.jcmj.modulos.bebidas.controller.dto.BebidaDto;
import dev.jcmj.modulos.bebidas.controller.dto.BebidaMapperDto;
import dev.jcmj.modulos.bebidas.domain.model.Bebida;

@Path("/V1/bebidas")
public class BebidaController {


    @Inject
    BebidaMapperDto mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bebida> fruits() {
        return Bebida.listAll();
    }
   

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newBebida(@Valid BebidaDto b) {
      Bebida model =  mapper.dtoToModel(b);
      
        model.persist();
        return Response.status(Status.CREATED).entity(mapper.modelToDto(model)).build();
    }

    @Transactional
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateBebida(@Valid BebidaDto a) {
        Bebida model = Bebida.findById(Long.parseLong(a.getId()));
        mapper.dtoToModelUpdate(a, model);
        model.persist();
        return Response.status(Status.CREATED).entity(mapper.modelToDto(model)).build();
    }

    @Transactional
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteBebida(@QueryParam("id") Long id) {
        try {
            Bebida.deleteById(id);
            return Response.status(Status.OK).build();
               
           } catch (Exception e) {
               return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
           }
    }
    
}
