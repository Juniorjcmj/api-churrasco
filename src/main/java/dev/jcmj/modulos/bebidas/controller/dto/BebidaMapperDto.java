package dev.jcmj.modulos.bebidas.controller.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.jcmj.modulos.bebidas.domain.model.Bebida;

@ApplicationScoped
public class BebidaMapperDto {
    

    public BebidaDto modelToDto( Bebida model){
        BebidaDto dto =  new BebidaDto();
        if(model.id != null){
            dto.setId(model.id.toString());
        }
        dto.setDescricao(model.descricao);
        dto.setQntdd(model.qntdd.toString());
        dto.setValor(model.valor.toString());
        return dto;

    }
    public Bebida dtoToModel( BebidaDto dto){
       Bebida model =  new Bebida();
       model.descricao = dto.getDescricao();
       model.qntdd = new BigDecimal(dto.getQntdd().replace(".", "").replace(",","."));
       model.valor = new BigDecimal(dto.getValor().replace(".", "").replace(",","."));
       return model;

    }
    public Bebida dtoToModelUpdate( BebidaDto dto, Bebida model){       
        model.descricao = dto.getDescricao();
        model.qntdd = new BigDecimal(dto.getQntdd().replace(".", "").replace(",","."));
        model.valor = new BigDecimal(dto.getValor().replace(".", "").replace(",","."));
        return model;
 
     }

    public List<BebidaDto> listModelToListDto(List<Bebida> models){
        List<BebidaDto> listDto =  new ArrayList<>();
        for (Bebida b : models) {
           listDto.add(modelToDto(b));
        }
        return listDto;
      }
}
