package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComentarioResponseDTO {
    private Long id;
    private String mensagem;
    private UsuarioResponseDTO autor;
    private LocalDateTime dataCriacao;

    private List<AnexoDTO> anexos;
}