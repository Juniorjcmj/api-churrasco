package dev.jcmj.modulos.orcamento.domain.service;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import dev.jcmj.modulos.orcamento.domain.model.Orcamento;

@ApplicationScoped
public interface IOrcamentoService {
    
   
    public void insert(Orcamento model);
   
    public void update(Orcamento model);
    
    public void setBebidas(Long idOrcamento, Long idBebida);
    public void setAcompanhamento(Long idOrcamento, Long idAcompanhamento);
    public void setCarnes(Long idOrcamento, Long idCarnes);
    public void setServicosDiversos(Long idOrcamento, Long idServicoDiverso);
}
