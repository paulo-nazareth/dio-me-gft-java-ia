package me.dio.web.spring_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.web.spring_web.model.Usuario;
import me.dio.web.spring_web.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public void post(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    
    @PutMapping
    public void put(@RequestBody Usuario usuario){
        repository.update(usuario);
    }
    
    @GetMapping
    public List<Usuario> getAll(){
        return repository.listAll();
    }
    
    @GetMapping("/{id}")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
