package br.pucrs.nomeusuario.exemplo.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Editora {
    @Id
    private Long codigo;
    private String nome;
}
