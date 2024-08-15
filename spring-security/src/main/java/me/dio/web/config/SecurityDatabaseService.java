package me.dio.web.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import me.dio.web.model.User;
import me.dio.web.repository.UserRepository;

@Service
public class SecurityDatabaseService implements UserDetailsService {
	
    @Autowired
    private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username);
        if(user==null){
        	throw new UsernameNotFoundException(username);
        }
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        user.getRoles().forEach(role -> {
        	authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        });
        UserDetails usuario = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
		return usuario;
	}
	
//  user = new User();
//  user.setName("ADMIN");
//  user.setUsername("admin");
//  user.setPassword("master123");
//  user.getRoles().add("MANAGERS");
//  repository.save(user);

}
