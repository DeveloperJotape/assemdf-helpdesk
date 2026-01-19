package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import java.time.LocalDateTime;

import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Cargo;

public record UsuarioResponseDTO(
    Long id,
    String nome,
    String email,
    boolean ativo,
    Cargo cargo,
    LocalDateTime dataCriacao,
    LocalDateTime dataAtualizacao,
    LocalDateTime dataUltimoAcesso
) {}