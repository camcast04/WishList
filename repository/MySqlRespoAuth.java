package com.wishlist.wishlist.repository;

import com.wishlist.wishlist.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MySqlRespoAuth extends JpaRepository<Author,Integer>{
    Optional<Author> findByLastName(String lastName);
}
