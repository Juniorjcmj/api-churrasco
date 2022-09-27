package dev.jcmj.share.modelMapper;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

import dev.jcmj.modulos.acompanhamento.controller.dto.AcompanhamentoDto;
import dev.jcmj.modulos.acompanhamento.domain.model.Acompanhamento;

public class ModelMapperConfig {

    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
	 
    Locale locale = new Locale("pt", "BR"); 
    String pattern = "#,##0.###";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);   
   
 
   public ModelMapper modelMapper() {
       var modelMapper = new ModelMapper();
       
       Converter<BigDecimal, String> bigdecimalToStringConverter = ctx -> decimalFormat.format(ctx.getSource());
       Converter<String, BigDecimal> stringToBigdecimalConverter = ctx -> new BigDecimal(ctx.getSource().replace(".", "").replace(",",".")) ;
       
       
       //ProcedimentoModel ==> Procedimento        
    //    modelMapper.createTypeMap(AcompanhamentoInput.class, Acompanhamento.class)
    //        .addMappings(mapper -> mapper.using(stringToBigdecimalConverter).map(AcompanhamentoInput::getValorTotal, Acompanhamento::ValorTotal));
       
       //Procedimento ==> ProcedimentoModel
    //    modelMapper.createTypeMap(Procedimento.class, ProcedimentoModel.class)
    //        .addMappings(mapper -> mapper.using(bigdecimalToStringConverter).map(Procedimento::getValor, ProcedimentoModel::setValor));  
       
       
    //  //ConsultaModel ==> consulta        
    //    modelMapper.createTypeMap(ConsultaModel.class, Consulta.class)           
    //        .<Long>addMapping(origem -> origem.getIdPaciente(), (dest, value) -> dest.getPaciente().setId(value))
    //        .<String>addMapping(origem -> origem.getNomePaciente(), (dest, value) -> dest.getPaciente().setNome(value));
       
    //  //Consulta ==> ConsultaModel        
    //    modelMapper.createTypeMap(Consulta.class, ConsultaModel.class)           
    //        .<String>addMapping(origem -> origem.getPaciente().getId(), (dest, value) -> dest.setIdPaciente(value))
    //        .<String>addMapping(origem -> origem.getPaciente().getNome(), (dest, value) -> dest.setNomePaciente(value));       
              
      
       return modelMapper;
   }

    

    
}
