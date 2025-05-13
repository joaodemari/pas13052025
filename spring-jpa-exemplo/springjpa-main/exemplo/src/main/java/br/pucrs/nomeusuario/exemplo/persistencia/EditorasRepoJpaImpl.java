package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository
@Primary
public class EditorasRepoJpaImpl implements IEditorasRepository {
    private IEditorasJpaItfRep repository;

    @Autowired
    public EditorasRepoJpaImpl(IEditorasJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Editora> getEditoras() {
        List<Editora> editoras = repository.findAll();
        if (editoras.size() == 0) {
            return new LinkedList<Editora>();
        } else {
            return editoras.stream()
                         .toList();
        }
    }

    @Override
    public Editora getEditoraId(long codigo) {
        Editora editora = repository.findByCodigo(codigo);
        return editora;
    }

}