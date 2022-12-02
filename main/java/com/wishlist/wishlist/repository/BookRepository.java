package com.wishlist.wishlist.repository;

import com.wishlist.wishlist.model.Author;
import com.wishlist.wishlist.model.Book;
import com.wishlist.wishlist.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    Book findByTitle(String name);

    Optional<Book> findByFirstnameAndLastname(String firstName, String lastName);

    Iterable<Book> findAllByTitle(String title);

    Iterable<Book> findAllByGenre(String genre);

    Iterable<Book> findTop10ByCopiesSoldGreaterThan(Integer copies, Sort sort);

    Optional<Book> findById(Integer id);

}

