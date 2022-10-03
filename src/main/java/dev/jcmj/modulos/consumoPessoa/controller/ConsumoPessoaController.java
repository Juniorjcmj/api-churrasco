package dev.jcmj.modulos.consumoPessoa.controller;

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

import dev.jcmj.modulos.consumoPessoa.controller.dto.ConsumoPessoaDto;
import dev.jcmj.modulos.consumoPessoa.controller.dto.ConsumoPessoaMapperToDto;
import dev.jcmj.modulos.consumoPessoa.domain.model.ConsumoPessoa;

@Path(value = "/V1/consumo-pessoa")
public class ConsumoPessoaController {
    

    @Inject
    ConsumoPessoaMapperToDto mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ConsumoPessoaDto> fruits() {
        return   mapper.listModelToListDto(ConsumoPessoa.listAll());
    }
   

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newBebida(@Valid ConsumoPessoaDto b) {
        ConsumoPessoa model =  mapper.dtoToModel(b);
      
        model.persist();
        return Response.status(Status.CREATED).entity(mapper.modelToDto(model)).build();
    }

    @Transactional
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateBebida(@Valid ConsumoPessoaDto a) {
        ConsumoPessoa model = ConsumoPessoa.findById(Long.parseLong(a.getId()));
        mapper.dtoToModelUpdate(model, a);
        model.persist();
        return Response.status(Status.CREATED).entity(mapper.modelToDto(model)).build();
    }

    @Transactional
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteBebida(@QueryParam("id") Long id) {
        try {
            ConsumoPessoa.deleteById(id);
            return Response.status(Status.OK).build();
               
           } catch (Exception e) {
               return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
           }
    }
    
}
