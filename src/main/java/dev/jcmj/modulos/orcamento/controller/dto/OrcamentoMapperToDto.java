package dev.jcmj.modulos.orcamento.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dev.jcmj.modulos.acompanhamento.controller.dto.AcompanhamentoModeltoDto;

import dev.jcmj.modulos.bebidas.controller.dto.BebidaMapperDto;
import dev.jcmj.modulos.carnes.controller.dto.CarnesMapperToDto;
import dev.jcmj.modulos.orcamento.domain.model.Orcamento;
import dev.jcmj.modulos.servicosDiversos.controller.dto.ServicoDiversoMapperToDto;

@ApplicationScoped
public class OrcamentoMapperToDto {  
    
    @Inject
    BebidaMapperDto bebidaMapperDto;
    @Inject
    AcompanhamentoModeltoDto acompanhamentoModeltoDto;
    @Inject
    CarnesMapperToDto carnesMapperToDto;
    @Inject
    ServicoDiversoMapperToDto diversoMapperToDto;


    public Orcamento inputToModel(OrcamentoInput input){
        Orcamento model = new Orcamento();
        model.id=null;
        model.clienteNome = input.getClienteNome();
        model.dataEvento =  LocalDate.parse(input.getDataEvento(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        return model;
    }

    public Orcamento dtoToModel(OrcamentoDto dto){
        Orcamento model = new Orcamento();
        try {
            if(dto.getId() != null){
                model.id =Long.parseLong(dto.getId());
            }
        model.clienteNome = dto.getClienteNome();
        model.dataEvento =  LocalDate.parse(dto.getDataEvento(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        model.criancas = new BigDecimal(dto.getCriancas().replace(".", "").replace(",","."));
        model.homens = new BigDecimal(dto.getHomens().replace(".", "").replace(",", "."));
        model.mulheres = new BigDecimal(dto.getMulheres().replace(".", "").replace(",", "."));
        model.comissaoServico = new BigDecimal(dto.getComissaoServico().replace(".", "").replace(",","."));
        model.custoPessoal = new BigDecimal(dto.getCustoPessoal().replace(".", "").replace(",", "."));
        model.custoTotalComInsumos = new BigDecimal(dto.getCustoTotalComInsumos().replace(".", "").replace(",", "."));
        model.valorFinalServico = new BigDecimal(dto.getValorFinalServico().replace(".", "").replace(",", "."));
        model.margemSeguranca = new BigDecimal(dto.getMargemSeguranca().replace(".", "").replace(",", "."));
        model.valorFinalServico = new BigDecimal(dto.getValorFinalServico().replace(".", "").replace(",", "."));
        model.percentualLucro = new BigDecimal(dto.getPercentualLucro().replace(".", "").replace(",", "."));
        model.bebidas = dto.getBebidas().stream().map(b -> bebidaMapperDto.dtoToModel(b)).collect(Collectors.toList());
        model.acompanhamentos = dto.getAcompanhamentos().stream().map(a -> acompanhamentoModeltoDto.dtoToModel(a)).collect(Collectors.toList());
        model.carnes = dto.getCarnes().stream().map(c -> carnesMapperToDto.dtoToModel(c)).collect(Collectors.toList());
        model.servicoDiversos = dto.getServicoDiversos().stream().map(s -> this.diversoMapperToDto.dtoToModel(s)).collect(Collectors.toList());

        } catch (Exception e) {
           
        }
        return model;
    }

    public OrcamentoDto modelToDto (Orcamento model){
        OrcamentoDto dto = new OrcamentoDto();
       if(model.id != null){
          dto.setId(model.id.toString());
       }     
       dto.setClienteNome(model.clienteNome);
       dto.setComissaoServico(model.comissaoServico.toString());
       dto.setDataEvento(model.dataEvento.toString());
       dto.setCriancas(model.criancas.toString());
       dto.setMulheres(model.mulheres.toString());
       dto.setHomens(model.homens.toString());
       dto.setCustoPessoal(model.custoPessoal.toString());
       dto.setMargemSeguranca(model.margemSeguranca.toString());
       dto.setPercentualLucro(model.percentualLucro.toString());
       dto.setCustoTotalComInsumos(model.custoTotalComInsumos.toString());
       dto.setValorFinalServico(model.valorFinalServico.toString());

       dto.setAcompanhamentos(model.acompanhamentos.stream().map(a -> this.acompanhamentoModeltoDto.modeltoDto(a)).collect(Collectors.toList()));
       dto.setBebidas(model.bebidas.stream().map(b -> this.bebidaMapperDto.modelToDto(b)).collect(Collectors.toList()));
       dto.setCarnes(model.carnes.stream().map(c -> this.carnesMapperToDto.modelToDto(c)).collect(Collectors.toList()));
       dto.setServicoDiversos(model.servicoDiversos.stream().map(s -> this.diversoMapperToDto.modelToDto(s)).collect(Collectors.toList()));

        return dto;
    }
    
    public Orcamento dtoToModelUpdate(Orcamento model, OrcamentoDto dto){
        try {
            if(dto.getId() != null){
                model.id =Long.parseLong(dto.getId());
            }
            model.clienteNome = dto.getClienteNome();
            model.comissaoServico = new BigDecimal(dto.getComissaoServico().replace(".", "").replace(",","."));
            model.criancas = new BigDecimal(dto.getCriancas().replace(".", "").replace(",","."));
            model.homens = new BigDecimal(dto.getHomens().replace(".", "").replace(",", "."));
            model.mulheres = new BigDecimal(dto.getMulheres().replace(".", "").replace(",", "."));
            model.custoPessoal = new BigDecimal(dto.getCustoPessoal().replace(".", "").replace(",", "."));
            model.custoTotalComInsumos = new BigDecimal(dto.getCustoTotalComInsumos().replace(".", "").replace(",", "."));
            model.dataEvento =  LocalDate.parse(dto.getDataEvento(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            model.valorFinalServico = new BigDecimal(dto.getValorFinalServico().replace(".", "").replace(",", "."));

            model.bebidas = dto.getBebidas().stream().map(b -> bebidaMapperDto.dtoToModel(b)).collect(Collectors.toList());
            model.acompanhamentos = dto.getAcompanhamentos().stream().map(a -> acompanhamentoModeltoDto.dtoToModel(a)).collect(Collectors.toList());
            model.carnes = dto.getCarnes().stream().map(c -> carnesMapperToDto.dtoToModel(c)).collect(Collectors.toList());
            model.servicoDiversos = dto.getServicoDiversos().stream().map(s -> this.diversoMapperToDto.dtoToModel(s)).collect(Collectors.toList());

        } catch (Exception e) {
           
        }

        return model;
    }

    public List<OrcamentoDto> listModelToListDto(List<Orcamento> models){
        List<OrcamentoDto> listDto =  new ArrayList<>();
        for (Orcamento b : models) {
           listDto.add(modelToDto(b));
        }
        return listDto;
      }
    
}
