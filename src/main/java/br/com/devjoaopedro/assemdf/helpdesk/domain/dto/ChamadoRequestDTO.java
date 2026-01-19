package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Prioridade;

public record ChamadoRequestDTO(
    String titulo,
    String descricao,
    Prioridade prioridade,
    Long clienteId,
    Long responsavelId
) {}