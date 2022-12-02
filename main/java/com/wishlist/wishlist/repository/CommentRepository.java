package com.wishlist.wishlist.repository;

import com.wishlist.wishlist.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface  CommentRepository extends CrudRepository<Comment, Integer> {
    Comment findByName(String name);

    Iterable<Comment> findAllByName(String name);
}

