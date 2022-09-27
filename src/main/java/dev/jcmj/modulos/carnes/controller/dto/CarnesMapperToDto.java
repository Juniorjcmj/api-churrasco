package dev.jcmj.modulos.carnes.controller.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.jcmj.modulos.carnes.domain.model.Carnes;

@ApplicationScoped
public class CarnesMapperToDto {
    

    public Carnes dtoToModel(CarnesDto dto){
      Carnes model = new Carnes();
      if(dto.getId()!= null){
        model.id = Long.parseLong(dto.getId());
      }
      model.atePorPessoa = Integer.parseInt( dto.getAtePorPessoa());
      model.item = dto.getItem();
      model.tipoCorte = dto.getTipoCorte();
      model.un = dto.getUn();
      model.custo = new BigDecimal(dto.getCusto().replace(".", "").replace(",","."));
      model.kg = new BigDecimal(dto.getKg().replace(".", "").replace(",","."));
      model.precoUnitario = new BigDecimal(dto.getPrecoUnitario().replace(".", "").replace(",","."));
      return model;
    }

    public CarnesDto modelToDto(Carnes model){
        CarnesDto dto = new CarnesDto();
        if(model.id!= null){
         dto.setId(model.id.toString());
        }
        dto.setAtePorPessoa(model.atePorPessoa.toString());
        dto.setCusto(model.custo.toString());
        dto.setItem(model.item);
        dto.setKg(model.kg.toString());
        dto.setPrecoUnitario(model.precoUnitario.toString());
        dto.setUn(model.un);
        dto.setTipoCorte(model.tipoCorte);

        return dto;
    }
    public Carnes dtoToModelUpdate(Carnes model, CarnesDto dto){
        model.atePorPessoa = Integer.parseInt( dto.getAtePorPessoa());
        model.item = dto.getItem();
        model.tipoCorte = dto.getTipoCorte();
        model.un = dto.getUn();
        model.custo = new BigDecimal(dto.getCusto().replace(".", "").replace(",","."));
        model.kg = new BigDecimal(dto.getKg().replace(".", "").replace(",","."));
        model.precoUnitario = new BigDecimal(dto.getPrecoUnitario().replace(".", "").replace(",","."));

        return model;
    }

    public List<CarnesDto> listModelToListDto(List<Carnes> models){
        List<CarnesDto> listDto =  new ArrayList<>();
        for (Carnes b : models) {
           listDto.add(modelToDto(b));
        }
        return listDto;
      }
}
