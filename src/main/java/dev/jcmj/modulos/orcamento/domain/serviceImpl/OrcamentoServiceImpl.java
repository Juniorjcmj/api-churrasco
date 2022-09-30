package dev.jcmj.modulos.orcamento.domain.serviceImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import dev.jcmj.modulos.acompanhamento.domain.model.Acompanhamento;
import dev.jcmj.modulos.bebidas.domain.model.Bebida;
import dev.jcmj.modulos.carnes.domain.model.Carnes;
import dev.jcmj.modulos.clientes.domain.model.Cliente;
import dev.jcmj.modulos.orcamento.domain.model.Orcamento;
import dev.jcmj.modulos.orcamento.domain.service.IOrcamentoService;
import dev.jcmj.modulos.orcamento.domain.service.OrcamentoBuilder;
import dev.jcmj.modulos.servicosDiversos.domain.model.ServicoDiversos;

@ApplicationScoped
public class OrcamentoServiceImpl implements IOrcamentoService {

    @Transactional
    @Override
    public void insert(Orcamento model) {
      
       Orcamento builder = new OrcamentoBuilder() 
                                    //  .setDataEvento(model.dataEvento)
                                    //  .setHomens(model.homens, model.mulheres, model.criancas)                                     
                                    //  .setCustoPessoal(model.custoPessoal)
                                    //  .setCustoTotalInsumo(model.custoTotalComInsumos)
                                    //  .setMargemSeguranca(model.margemSeguranca)
                                    //  .setComissaoServico(model.comissaoServico)
                                    //  .setPercentualLucro(model.percentualLucro)
                                    //  .setValorFinalServico(model.valorFinalServico)
                                  //   .setAcompanhamentos(model.acompanhamentos)
                                   //  .setBebidas(model.bebidas)
                                   //  .setCarnes(model.carnes)
                                   //  .setServicosDiversos(model.servicoDiversos)
                                    // .setNomeCliente(model.clienteNome)
                                     .construir();
        Orcamento.persist(builder);
    }
    @Transactional
    @Override
    public void update(Orcamento model) {      
        Orcamento builder = new OrcamentoBuilder(model) 
              //  .setDataEvento(model.dataEvento)
                // .setHomens(model.homens, model.mulheres, model.criancas)               
                // .setCustoPessoal(model.custoPessoal)
                // .setCustoTotalInsumo(model.custoTotalComInsumos)
                // .setMargemSeguranca(model.margemSeguranca)
                // .setComissaoServico(model.comissaoServico)
                // .setPercentualLucro(model.percentualLucro)
                // .setValorFinalServico(model.valorFinalServico)
               // .setAcompanhamentos(model.acompanhamentos)
               // .setBebidas(model.bebidas)
              //  .setCarnes(model.carnes)
              //  .setServicosDiversos(model.servicoDiversos)
               // .setNomeCliente(model.clienteNome)
                .construir();
            Orcamento.persist(builder);
        
    }
    @Transactional
    @Override
    public void setBebidas(Long idOrcamento, Long idBebida) {
        Orcamento model = Orcamento.findById(idOrcamento);
        Bebida modelBebida = Bebida.findById(idBebida); 
      //  model.bebidas.add(modelBebida);
        update(model);
    }
    @Transactional
    @Override
    public void setAcompanhamento(Long idOrcamento, Long idAcompanhamento) {
        Orcamento model = Orcamento.findById(idOrcamento);
        Acompanhamento modelAcompanhamento = Acompanhamento.findById(idAcompanhamento); 
      //  model.acompanhamentos.add(modelAcompanhamento);
        update(model);
        
    }
    @Transactional
    @Override
    public void setCarnes(Long idOrcamento, Long idCarnes) {
        Orcamento model = Orcamento.findById(idOrcamento);
        Carnes modelCarnes = Carnes.findById(idCarnes); 
      //  model.carnes.add(modelCarnes);
        update(model);
        
        
    }
    @Transactional
    @Override
    public void setServicosDiversos(Long idOrcamento, Long idServicoDiverso) {
        Orcamento model = Orcamento.findById(idOrcamento);
        ServicoDiversos modelCarnes = Carnes.findById(idServicoDiverso); 
       // model.servicoDiversos.add(modelCarnes);
        update(model);
        
    }
    

}
