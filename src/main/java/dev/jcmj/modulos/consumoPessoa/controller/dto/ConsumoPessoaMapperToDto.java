package dev.jcmj.modulos.consumoPessoa.controller.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.jcmj.modulos.consumoPessoa.domain.model.ConsumoPessoa;

@ApplicationScoped
public class ConsumoPessoaMapperToDto {
    

    public ConsumoPessoa dtoToModel(ConsumoPessoaDto dto){

        ConsumoPessoa model = new ConsumoPessoa();
         model.descricao = dto.getDescricao();
         model.tipoConvidado = dto.getTipoConvidado();
         model.qntdd = new BigDecimal(dto.getQntdd().replace(".", "").replace(",",".")) ;
         model.un = dto.getUn();
        return model;
    }

    public ConsumoPessoaDto  modelToDto(ConsumoPessoa model){
        ConsumoPessoaDto dto = new ConsumoPessoaDto();
        if(model.id != null){
            dto.setId(model.id.toString());
        }
        dto.setDescricao(model.descricao);
        dto.setQntdd(model.qntdd.toString());
        dto.setTipoConvidado(model.tipoConvidado);
        dto.setUn(model.un.toString());
        return dto;
    }

    public ConsumoPessoa dtoToModelUpdate(ConsumoPessoa model,ConsumoPessoaDto dto){
        model.descricao = dto.getDescricao();
        model.tipoConvidado = dto.getTipoConvidado();
        model.qntdd = new BigDecimal(dto.getQntdd().replace(".", "").replace(",",".")) ;
        model.un = dto.getUn();

        return model;
    }

    public List<ConsumoPessoaDto> listModelToListDto(List<ConsumoPessoa> models){
        List<ConsumoPessoaDto> listDto =  new ArrayList<>();
        for (ConsumoPessoa b : models) {
           listDto.add(modelToDto(b));
        }
        return listDto;
      }
}
