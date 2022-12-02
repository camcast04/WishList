package com.wishlist.wishlist.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.wishlist.wishlist.model.User;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface  UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByName(String name);


    Optional<User> findByEmail(String email);
}



