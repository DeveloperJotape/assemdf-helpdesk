package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnexoDTO {
    private Long id;
    private String nomeArquivo;
    private String url;
    private String tipo;
}