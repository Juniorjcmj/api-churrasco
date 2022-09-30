package dev.jcmj.modulos.orcamento.domain.serviceImpl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import dev.jcmj.modulos.acompanhamento.domain.model.Acompanhamento;
import dev.jcmj.modulos.bebidas.domain.model.Bebida;
import dev.jcmj.modulos.carnes.domain.model.Carnes;
import dev.jcmj.modulos.orcamento.domain.model.Orcamento;
import dev.jcmj.modulos.orcamento.domain.service.IOrcamentoService;
import dev.jcmj.modulos.orcamento.domain.service.OrcamentoBuilder;
import dev.jcmj.modulos.servicosDiversos.domain.model.ServicoDiversos;

@ApplicationScoped
public class OrcamentoServiceImpl implements IOrcamentoService {

    @Transactional
    @Override
    public Orcamento insert(Orcamento model) {
      
       Orcamento builder = new OrcamentoBuilder() 
                .setId(model.id)
                .setDataEvento(model.dataEvento)
                .setHomens(model.homens, model.mulheres, model.criancas)                                     
                .setCustoPessoal(model.custoPessoal)
                .setCustoTotalInsumo(model.custoTotalComInsumos)
                .setMargemSeguranca(model.margemSeguranca)
                .setComissaoServico(model.comissaoServico)
                .setPercentualLucro(model.percentualLucro)
                .setValorFinalServico(model.valorFinalServico)
                .setAcompanhamentos(model.acompanhamentos)
                .setBebidas(model.bebidas)
                .setCarnes(model.carnes)
                .setServicosDiversos(model.servicoDiversos)
                .setNomeCliente(model.clienteNome)
                .construir();                     
        Orcamento.persist(builder);
        return builder;
    }
    @Transactional
    @Override
    public Orcamento update(Orcamento model) {      
        Orcamento builder = new OrcamentoBuilder(model) 
                .setDataEvento(model.dataEvento)
                .setHomens(model.homens, model.mulheres, model.criancas)               
                .setCustoPessoal(model.custoPessoal)
                .setCustoTotalInsumo(model.custoTotalComInsumos)
                .setMargemSeguranca(model.margemSeguranca)
                .setComissaoServico(model.comissaoServico)
                .setPercentualLucro(model.percentualLucro)
                .setValorFinalServico(model.valorFinalServico)
                .setAcompanhamentos(model.acompanhamentos)
                .setBebidas(model.bebidas)
                .setCarnes(model.carnes)
                .setServicosDiversos(model.servicoDiversos)
                .setNomeCliente(model.clienteNome)
                .construir();
            Orcamento.persist(builder);
            return builder;
        
    }
    @Transactional
    @Override
    public Orcamento setBebidas(Long idOrcamento, Long idBebida) {

        Orcamento model = Orcamento.findById(idOrcamento);
        try {
            Bebida modelBebida = Bebida.findById(idBebida); 
            List<Bebida> bebidas = model.bebidas;
            bebidas.add(modelBebida);
            model.bebidas = bebidas;
            return update(model);
        } catch (Exception e) {
            // TODO: handle exception
        }
       return model;
    }
    @Transactional
    @Override
    public Orcamento setAcompanhamento(Long idOrcamento, Long idAcompanhamento) {
        Orcamento model = Orcamento.findById(idOrcamento);
        try {
            Acompanhamento modelAcompanhamento = Acompanhamento.findById(idAcompanhamento); 
            List<Acompanhamento> acompanhamantos = model.acompanhamentos;
            acompanhamantos.add(modelAcompanhamento);
            model.acompanhamentos = acompanhamantos;
            return update(model);
            
        } catch (Exception e) {
           
        }
        return model;
    }
    @Transactional
    @Override
    public Orcamento setCarnes(Long idOrcamento, Long idCarnes) {
        Orcamento model = Orcamento.findById(idOrcamento);
        try {
            Carnes modelCarnes = Carnes.findById(idCarnes); 
            List<Carnes> carnes =  model.carnes;
            carnes.add(modelCarnes);
            model.carnes = carnes;
            return update(model);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return model;
        
    }
    @Transactional
    @Override
    public Orcamento setServicosDiversos(Long idOrcamento, Long idServicoDiverso) {
        Orcamento model = Orcamento.findById(idOrcamento);

        try {
            ServicoDiversos modelCarnes = Carnes.findById(idServicoDiverso); 
          List<ServicoDiversos> servicos =  model.servicoDiversos;
          servicos.add(modelCarnes);
          model.servicoDiversos = servicos;
            return update(model);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return model;
    }
    

}
