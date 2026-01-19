package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Prioridade;
import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Status;

public record ChamadoResponseDTO(
    Long id,
    String titulo,
    String descricao,
    Status status,
    Prioridade prioridade,
    LocalDateTime dataAbertura,
    LocalDateTime dataAtualizacao,
    LocalDateTime dataFechamento,
    UsuarioResponseDTO cliente,
    UsuarioResponseDTO responsavel,
    List<ComentarioResponseDTO> comentarios,
    List<AnexoResponseDTO> anexos
) {}