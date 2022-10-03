package dev.jcmj.modulos.servicosDiversos.controller.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicoDiversoDto {
    
    public String id;
    @NotNull(message = "Descrição é obrigatória")
    public String descricao;
    @NotNull(message = "Tipo de serviço diverso é obrigatório")
    public String tipoServicoDiverso;
    @NotNull(message = "Quantidade é obrigatória")
    public String qntdd;
    @NotNull(message = "Valçor é obrigatório")
    public String valor;
    
    public String valorTotal;
}
