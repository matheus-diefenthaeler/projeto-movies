package com.matheus.projetomovies.repositories;

import com.matheus.projetomovies.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
