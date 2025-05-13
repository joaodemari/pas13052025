package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface IEditorasJpaItfRep extends CrudRepository<Editora,Long>{
    List<Editora> findAll(); 
    Editora findByCodigo(long codigo); 
}




