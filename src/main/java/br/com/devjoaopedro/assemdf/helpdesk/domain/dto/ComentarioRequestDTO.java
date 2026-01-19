package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComentarioRequestDTO {
    private String mensagem;
    private Long autorId;
    private Long chamadoId;
    private List<Long> anexoIds;  
}