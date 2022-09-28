package dev.jcmj.modulos.servicosDiversos.controller.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.jcmj.modulos.servicosDiversos.domain.model.ServicoDiversos;

@ApplicationScoped
public class ServicoDiversoMapperToDto {
    

    public ServicoDiversos dtoToModel(ServicoDiversoDto dto){
        ServicoDiversos model = new ServicoDiversos();
        model.id = Long.parseLong(dto.getId());
        model.descricao =  dto.getDescricao();
        model.qntdd = new BigDecimal(dto.getQntdd().replace(".", "").replace(",","."));
        model.valor = new BigDecimal(dto.valor.replace(".", "").replace(",","."));
        model.valorTotal = model.qntdd.multiply(model.valor);
        model.tipoServicoDiverso = dto.getTipoServicoDiverso();

        return model;
    }

    public ServicoDiversoDto modelToDto(ServicoDiversos model){
        ServicoDiversoDto dto = new ServicoDiversoDto();
        if(model.id != null){
            dto.setId(model.id.toString());
        }
        dto.setDescricao(model.descricao);
        dto.setQntdd(model.qntdd.toString());
        dto.setTipoServicoDiverso(model.tipoServicoDiverso);
        dto.setValor(model.valor.toString());
        dto.setValorTotal(model.valorTotal.toString());
        
        return dto;
    }

    public ServicoDiversos dtoToModelUpdate(ServicoDiversoDto dto,  ServicoDiversos model){
       
        model.id = Long.parseLong(dto.getId());
        model.descricao =  dto.getDescricao();
        model.qntdd = new BigDecimal(dto.getQntdd().replace(".", "").replace(",","."));
        model.valor = new BigDecimal(dto.valor.replace(".", "").replace(",","."));
        model.valorTotal = model.qntdd.multiply(model.valor);
        model.tipoServicoDiverso = dto.getTipoServicoDiverso();

        return model;
    }

    public List<ServicoDiversoDto> listModelToListDto(List<ServicoDiversos> models){
        List<ServicoDiversoDto> listDto =  new ArrayList<>();
        for (ServicoDiversos b : models) {
           listDto.add(modelToDto(b));
        }
        return listDto;
      }
}
