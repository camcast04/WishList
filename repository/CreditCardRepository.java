package com.wishlist.wishlist.repository;

import com.wishlist.wishlist.model.CreditCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard, Integer> {
    Optional<CreditCard> findByUsername(String name);

    Iterable<CreditCard> findAllByUsername(String name);
}



