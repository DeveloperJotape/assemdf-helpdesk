package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

public record AnexoRequestDTO(
                String nomeArquivo,
                String url,
                String tipo,
                Long chamadoId,
                Long comentarioId) {

}
