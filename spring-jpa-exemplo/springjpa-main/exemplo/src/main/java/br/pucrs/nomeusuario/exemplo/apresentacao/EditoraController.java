package br.pucrs.nomeusuario.exemplo.apresentacao;

import br.pucrs.nomeusuario.exemplo.persistencia.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/editoras")
public class EditoraController {
    private IEditorasRepository editoras;

    @Autowired
    public EditoraController(IEditorasRepository editoras) {
        this.editoras = editoras;        
    }

    @GetMapping("")
    public List<Editora> getEditoras() {
        return editoras.getEditoras();
    }

    @GetMapping("{codigo}")
    public Editora getLivroTitulo(@PathVariable("codigo") long codigo) {
        return editoras.getEditoraId(codigo);
    }

}