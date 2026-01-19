package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import java.util.List;

public record ComentarioRequestDTO(
    String mensagem,
    Long autorId,
    Long chamadoId,
    List<Long> anexoIds
) {}