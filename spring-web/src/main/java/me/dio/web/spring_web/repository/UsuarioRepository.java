package me.dio.web.spring_web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import me.dio.web.spring_web.handler.BusinessException;
import me.dio.web.spring_web.handler.CampoObrigatorioException;
import me.dio.web.spring_web.model.Usuario;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
    	
    	if(usuario.getPassword() == null)
    		throw new CampoObrigatorioException("Senha");
    	if(usuario.getLogin() == null)
    		throw new CampoObrigatorioException("Login");
//    		throw new BusinessException("O campo login é obrigatório!");
    		
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
        
        
    }
    
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }
	
}
