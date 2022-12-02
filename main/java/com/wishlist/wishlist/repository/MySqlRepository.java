package com.wishlist.wishlist.repository;

import com.wishlist.wishlist.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//public interface MySqlRepository extends CrudRepository<BookInfo,Integer> {}
public interface MySqlRepository extends JpaRepository<Book,Integer>{
    Optional<Book> findByIsbn(String isbn);
}

