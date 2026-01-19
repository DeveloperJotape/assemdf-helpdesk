package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

public record ComentarioResponseDTO(
    Long id,
    String mensagem,
    UsuarioResponseDTO autor,
    LocalDateTime dataCriacao,
    List<AnexoResponseDTO> anexos
) {}