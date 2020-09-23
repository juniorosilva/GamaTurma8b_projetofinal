package br.itau.justificativa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.justificativa.dao.UsuarioDAO;
import br.itau.justificativa.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuarios")
    public List<Usuario> buscarTodos(){
        List<Usuario> lista = (List<Usuario>)dao.findAll();
        return lista;
    }

}
 

