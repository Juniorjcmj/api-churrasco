package dev.jcmj.modulos.orcamento.domain.service;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import dev.jcmj.modulos.orcamento.domain.model.Orcamento;

@ApplicationScoped
public interface IOrcamentoService {
    
   
    public Orcamento insert(Orcamento model);
   
    public Orcamento update(Orcamento model);
    
    public Orcamento setBebidas(Long idOrcamento, Long idBebida);
    public Orcamento setAcompanhamento(Long idOrcamento, Long idAcompanhamento);
    public Orcamento setCarnes(Long idOrcamento, Long idCarnes);
    public Orcamento setServicosDiversos(Long idOrcamento, Long idServicoDiverso);
}
