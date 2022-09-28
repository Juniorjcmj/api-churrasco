package dev.jcmj.modulos.servicosDiversos.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicoDiversoDto {
    
    public String id;
    public String descricao;
    public String tipoServicoDiverso;
    public String qntdd;
    public String valor;
    public String valorTotal;
}
