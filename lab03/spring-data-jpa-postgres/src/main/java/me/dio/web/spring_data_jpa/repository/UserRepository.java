package me.dio.web.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.web.spring_data_jpa.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
