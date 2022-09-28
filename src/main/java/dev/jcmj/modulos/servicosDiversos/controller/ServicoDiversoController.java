package dev.jcmj.modulos.servicosDiversos.controller;

import java.util.List;


import javax.inject.Inject;
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

import dev.jcmj.modulos.servicosDiversos.controller.dto.ServicoDiversoDto;
import dev.jcmj.modulos.servicosDiversos.controller.dto.ServicoDiversoMapperToDto;
import dev.jcmj.modulos.servicosDiversos.domain.model.ServicoDiversos;

@Path(value = "/V1/servico-diverso")
public class ServicoDiversoController {


    @Inject
    ServicoDiversoMapperToDto mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ServicoDiversoDto> fruits() {
        return mapper.listModelToListDto(ServicoDiversos.listAll()) ;
    }
  
    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newFruit(ServicoDiversoDto a) {       
        ServicoDiversos model = mapper.dtoToModel(a);   
      
        model.persist();
        return Response.status(Status.CREATED).entity(mapper.modelToDto(model)).build();
    }
    @Transactional
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(ServicoDiversoDto dto) {
        ServicoDiversos model =  ServicoDiversos.findById(Long.parseLong(dto.getId()));
        ServicoDiversos ac =     mapper.dtoToModelUpdate(dto, model);
        try {          
            ac.persist();
            return Response.status(Status.CREATED).entity(mapper.modelToDto(ac)).build();
            
        } catch (Exception e) {
            return Response.status(Status.NOT_IMPLEMENTED).entity(e).build();
        }
    }

    @Transactional
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response detete(@QueryParam("id") Long id) {
        try {
            ServicoDiversos.deleteById(id);
         return Response.status(Status.OK).build();
            
        } catch (Exception e) {
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    
}
