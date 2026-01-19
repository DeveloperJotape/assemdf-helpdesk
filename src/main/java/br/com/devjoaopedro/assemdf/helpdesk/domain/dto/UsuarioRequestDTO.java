package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Cargo;

public record UsuarioRequestDTO(
    String nome,
    String email,
    String senha,
    boolean ativo,
    Cargo cargo
) {}