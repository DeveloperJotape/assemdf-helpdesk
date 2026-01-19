package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Prioridade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChamadoRequestDTO {
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private Long clienteId;
    private Long responsavelId;
}