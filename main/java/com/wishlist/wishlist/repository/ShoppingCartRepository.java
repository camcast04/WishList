package com.wishlist.wishlist.repository;

import com.wishlist.wishlist.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface  ShoppingCartRepository extends CrudRepository<ShoppingCart, Integer> {
    Optional<ShoppingCart> findByUser(String name);

}