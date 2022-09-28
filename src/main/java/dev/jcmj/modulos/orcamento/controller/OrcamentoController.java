package dev.jcmj.modulos.orcamento.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.jcmj.modulos.orcamento.domain.model.Orcamento;

@Path(value = "/V1/orcamento")
public class OrcamentoController {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Orcamento> fruits() {
        return   Orcamento.listAll();
    }
   
}
