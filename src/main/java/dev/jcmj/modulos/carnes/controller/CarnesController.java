package dev.jcmj.modulos.carnes.controller;

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

import dev.jcmj.modulos.carnes.controller.dto.CarnesDto;
import dev.jcmj.modulos.carnes.controller.dto.CarnesMapperToDto;
import dev.jcmj.modulos.carnes.domain.model.Carnes;

@Path("/V1/carnes")
public class CarnesController {
    
    @Inject
    CarnesMapperToDto mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CarnesDto> fruits() {
        return mapper.listModelToListDto(Carnes.listAll()) ;
    }
  
    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newFruit(@Valid CarnesDto a) {       
        Carnes model = mapper.dtoToModel(a);   
      
        model.persist();
        return Response.status(Status.CREATED).entity(mapper.modelToDto(model)).build();
    }
    @Transactional
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@Valid CarnesDto a) {
     Carnes model =  Carnes.findById(Long.parseLong(a.getId()));
     Carnes ac =     mapper.dtoToModelUpdate(model, a );
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
         Carnes.deleteById(id);
         return Response.status(Status.OK).build();
            
        } catch (Exception e) {
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

}
