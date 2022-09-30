package dev.jcmj.modulos.orcamento.controller;

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

import dev.jcmj.modulos.orcamento.controller.dto.OrcamentoDto;
import dev.jcmj.modulos.orcamento.controller.dto.OrcamentoMapperToDto;
import dev.jcmj.modulos.orcamento.domain.model.Orcamento;
import dev.jcmj.modulos.orcamento.domain.service.IOrcamentoService;

@Path(value = "/V1/orcamento")
public class OrcamentoController {
    
   @Inject
   OrcamentoMapperToDto modelToDto;
   @Inject
   IOrcamentoService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<OrcamentoDto> getAll() {
        return  modelToDto.listModelToListDto(Orcamento.listAll());
    }
    
   
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response insert(OrcamentoDto dto) {  
        try {
            Orcamento model = modelToDto.dtoToModel(dto);           
            return Response.status(Status.CREATED)
            .entity(modelToDto.modelToDto(this.service.insert(model))
            ).build();
            
        } catch (Exception e) {
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
    @Transactional
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(OrcamentoDto a) {
     Orcamento model =  Orcamento.findById(Long.parseLong(a.getId()));
     Orcamento ac =     modelToDto.dtoToModelUpdate(model,a);
        try {          
            this.service.update(ac);
            return Response.status(Status.CREATED).entity(modelToDto.modelToDto(ac)).build();
            
        } catch (Exception e) {
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @Transactional
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response detete(@QueryParam("id") Long id) {
        try {
         Orcamento.deleteById(id);
         return Response.status(Status.OK).build();
            
        } catch (Exception e) {
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @Path(value = "/add-carnes")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response setCarnes(@QueryParam("idOrcamento") Long idOrcamento, @QueryParam("idCarnes") Long idCarnes) {
        if (idOrcamento != null && idCarnes != null) {
            this.service.setCarnes(idOrcamento, idCarnes);
            return Response.status(Status.CREATED).build();
        }
        return Response.status(Status.FOUND).build();
    }
    @Path(value = "/add-acompanhamento")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response setAcompanhamento(@QueryParam("idOrcamento") Long idOrcamento, @QueryParam("idAcompanhamento") Long idAcompanhamento) {
        if (idOrcamento != null && idAcompanhamento != null) {            
            return Response.status(Status.CREATED)
            .entity(modelToDto.modelToDto(this.service.setAcompanhamento(idOrcamento, idAcompanhamento))).build();
        }
        return Response.status(Status.FOUND).build();
    }
    @Path(value = "/add-servico-diverso")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response setServicoDiverso(@QueryParam("idOrcamento") Long idOrcamento, @QueryParam("idServicoDiverso") Long idServicoDiverso) {
        if (idOrcamento != null && idServicoDiverso != null) {
            this.service.setServicosDiversos(idOrcamento, idServicoDiverso);
            return Response.status(Status.CREATED).build();
        }
        return Response.status(Status.FOUND).build();
    }
    @Path(value = "/add-bebidas")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response setbebidas(@QueryParam("idOrcamento") Long idOrcamento, @QueryParam("idBebidas") Long idBebidas) {
        if (idOrcamento != null && idBebidas != null) {
            this.service.setBebidas(idOrcamento, idBebidas);
            return Response.status(Status.CREATED).build();
        }
        return Response.status(Status.FOUND).build();
    }
}
