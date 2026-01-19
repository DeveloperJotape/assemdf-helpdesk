package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Prioridade;
import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChamadoDTO {
    private Long id;
    private String titulo;
    private String descricao;
    private Status status;
    private Prioridade prioridade;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataAtualizacao;
    private LocalDateTime dataFechamento;

    private UsuarioDTO cliente;
    private UsuarioDTO responsavel;

    private List<ComentarioDTO> comentarios;
    private List<AnexoDTO> anexos;
}