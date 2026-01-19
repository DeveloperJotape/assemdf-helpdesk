package br.com.devjoaopedro.assemdf.helpdesk.domain.dto;

import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Cargo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequestDTO {
    private String nome;
    private String email;
    private String senha; 
    private boolean ativo;
    private Cargo cargo;
}