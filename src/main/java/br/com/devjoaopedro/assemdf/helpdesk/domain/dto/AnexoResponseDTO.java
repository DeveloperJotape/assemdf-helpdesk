package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

public record AnexoResponseDTO(
        Long id,
        String nomeArquivo,
        String url,
        String tipo,
        Long chamadoId,
        Long comentarioId) {
}