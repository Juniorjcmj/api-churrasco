package dev.jcmj.modulos.acompanhamento.controller.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.jcmj.modulos.acompanhamento.domain.model.Acompanhamento;

@ApplicationScoped
public class ModeltoDto {
    
    public AcompanhamentoDto  modeltoDto (Acompanhamento model){   
       AcompanhamentoDto dto = new AcompanhamentoDto();    
       dto.setDescricao(model.descricao);
       dto.setId(model.id.toString());
       dto.setTipoAcompanhamento(model.tipoAcompanhamento);
       dto.setValorUn(model.valorUn.toString());
       dto.setKg(model.kg.toString());
       dto.setValorTotal(model.ValorTotal.toString());
       return dto;
    }
    public Acompanhamento dtoToModel(AcompanhamentoDto dto){
        Acompanhamento model =  new Acompanhamento();
        if(!(dto.getId() == null)){
          model.id = Long.parseLong(dto.getId());
        }
        model.valorUn = new BigDecimal(dto.getValorUn().replace(".", "").replace(",","."));
        model.kg = new BigDecimal(dto.getKg().replace(".", "").replace(",","."));
        model.ValorTotal = model.valorUn.multiply(model.kg);
        model.descricao = dto.getDescricao();
        model.tipoAcompanhamento = dto.getTipoAcompanhamento();
       
        return model;
    }
    public Acompanhamento dtoToModelUpdate(AcompanhamentoDto dto,   Acompanhamento model){     

      model.valorUn = new BigDecimal(dto.getValorUn().replace(".", "").replace(",","."));
      model.kg = new BigDecimal(dto.getKg().replace(".", "").replace(",","."));
      model.ValorTotal = model.valorUn.multiply(model.kg);
      model.descricao = dto.getDescricao();
      model.tipoAcompanhamento = dto.getTipoAcompanhamento();
     
      return model;
  }
    

    public List<AcompanhamentoDto> listModelToListDto(List<Acompanhamento> models){
      List<AcompanhamentoDto> listDto =  new ArrayList<>();
      for (Acompanhamento acompanhamento : models) {
         listDto.add(modeltoDto( acompanhamento));
      }
      return listDto;
    }
  
}
