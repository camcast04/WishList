package com.wishlist.wishlist.repository;

import com.wishlist.wishlist.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
    Optional<Admin> findByName(String name);
}



