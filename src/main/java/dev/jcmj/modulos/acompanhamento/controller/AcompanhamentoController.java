package dev.jcmj.modulos.acompanhamento.controller;

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

import dev.jcmj.modulos.acompanhamento.controller.dto.AcompanhamentoDto;
import dev.jcmj.modulos.acompanhamento.controller.dto.AcompanhamentoModeltoDto;
import dev.jcmj.modulos.acompanhamento.domain.model.Acompanhamento;
import io.quarkus.security.Authenticated;

@Path("/V1/acompanhamento")
@Authenticated
public class AcompanhamentoController {  
    
 //Outra forma de fazer injeção de dependencia
 // nao usa o private pois o querkus ja entende
 //MeuServico servico
 // @Inject
//  public void init(MeuServico servico){
//     this.servico = servico;
//  }

    @Inject
    AcompanhamentoModeltoDto modelToDto;    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AcompanhamentoDto> fruits() {
        return modelToDto.listModelToListDto(Acompanhamento.listAll()) ;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AcompanhamentoDto> fruits(@QueryParam("tipo") String tipo) {
        if (tipo != null) {
            return modelToDto.listModelToListDto(Acompanhamento.findBySeason(tipo)) ; 
        }
        return modelToDto.listModelToListDto(Acompanhamento.listAll()) ;
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newAcompanhamento(@Valid AcompanhamentoDto a) { 
       try {
           Acompanhamento model = modelToDto.dtoToModel(a);      
           model.persist();
           return Response.status(Status.CREATED).entity(modelToDto.modeltoDto(model)).build();
        
       } catch (Exception e) {
        return Response.status(Status.NOT_IMPLEMENTED).entity(e.getMessage()).build();
       }
    }
    @Transactional
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@Valid AcompanhamentoDto a) {
     Acompanhamento model =  Acompanhamento.findById(Long.parseLong(a.getId()));
     Acompanhamento ac =     modelToDto.dtoToModelUpdate(a, model);
        try {          
            ac.persist();
            return Response.status(Status.CREATED).entity(modelToDto.modeltoDto(ac)).build();
            
        } catch (Exception e) {
            return Response.status(Status.NOT_IMPLEMENTED).entity(e.getMessage()).build();
        }
    }

    @Transactional
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response detete(@QueryParam("id") Long id) {
        try {
         Acompanhamento.deleteById(id);
         return Response.status(Status.OK).build();
            
        } catch (Exception e) {
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

 
}
