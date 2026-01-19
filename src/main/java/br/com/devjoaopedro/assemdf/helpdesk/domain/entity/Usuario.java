package br.com.devjoaopedro.assemdf.helpdesk.domain.entity;

import java.time.LocalDateTime;
import java.util.List;

import br.com.devjoaopedro.assemdf.helpdesk.domain.enums.Cargo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;
    private Cargo cargo;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private LocalDateTime dataAtualizacao;
    private LocalDateTime dataUltimoAcesso;

    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamadosComoCliente;

    @OneToMany(mappedBy = "responsavel")
    private List<Chamado> chamadosComoResponsavel;

    @OneToMany(mappedBy = "autor")
    private List<Comentario> comentarios;
}
