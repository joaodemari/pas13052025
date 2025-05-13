package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IEditorasRepository {
    List<Editora> getEditoras();
    Editora getEditoraId(long id);
}