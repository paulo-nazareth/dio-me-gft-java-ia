package me.dio.web.service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface CrudService<ID, T> {
	
    List<T> findAll();
    
    T findById(ID id) throws NotFoundException;
    
    T create(T entity);
    
    T update(ID id, T entity) throws NotFoundException;
    
    void delete(ID id) throws NotFoundException;
    
}