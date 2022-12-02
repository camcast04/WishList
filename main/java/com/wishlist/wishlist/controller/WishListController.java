package com.wishlist.wishlist.controller;

import com.wishlist.wishlist.model.*;
import com.wishlist.wishlist.model.Book;
import com.wishlist.wishlist.model.User;
import com.wishlist.wishlist.model.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import com.wishlist.wishlist.repository.BookRepository;
import com.wishlist.wishlist.repository.ShoppingCartRepository;
import com.wishlist.wishlist.repository.UserRepository;
import com.wishlist.wishlist.repository.WishlistRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping (path = "/shoppingCart")

@RestController
public class WishListController {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    @Autowired
    private WishlistRepository wishlistRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewCart (@RequestParam String username,
                                            @RequestParam Integer isbn) {
        if(userRepository.findByName(username).isPresent()){
            if(wishlistRepository.findByUser(username).isPresent()){
                Wishlist wish = wishlistRepository.findByUser(username).get();
                wish.setUser(username);
                wish.addBook(isbn);
                wishlistRepository.save(wish);
            } else {
                Wishlist wish = new Wishlist();
                wish.setUser(username);
                wish.addBook(isbn);
                wishlistRepository.save(wish);
            }
            return "saved";
        } else return "User doesn't exist";
    }

    @PutMapping(path = "/removeAll")
    public @ResponseBody String removeAllBooks (@RequestParam String username){
        Wishlist wish = wishlistRepository.findByUser(username).get();
        wish.removeAllBooks();
        wishlistRepository.save(wish);
        return "removed all entries";
    }

    @GetMapping (path = "/all")
    public @ResponseBody Iterable<Wishlist> getBooks (){
        return wishlistRepository.findAll();
    }
    public void saver(Wishlist wish){
        wishlistRepository.save(wish);
    }


    @PostMapping (path = "/addBook")
    public @ResponseBody String addBook (@RequestParam String username, @RequestParam int isbn){
        if(userRepository.findByName(username).isPresent()){
            if (!wishlistRepository.findByUser(username).isPresent()) {
                Wishlist wish = wishlistRepository.findByUser(username).get();
                wish.addBook(isbn);
                wishlistRepository.save(wish);
                return "saved";
            } else {
                Wishlist wish = new Wishlist();
                Book x = bookRepository.findById(isbn).get();
                wish.addBook(isbn);
                wishlistRepository.save(wish);
                return "saved";
            }
        } else return "user doesn't exist";
    }

    @DeleteMapping (path = "/deleteBook")
    public @ResponseBody String deleteBooks (@RequestParam String username,
                                             @RequestParam String password, @RequestParam Integer isbn) {
        User n = userRepository.findByName(username).get();
        if (password != n.getPassword()) {
            return "Incorrect password";
        }

        if (!wishlistRepository.findByUser(username).isPresent()) {
            Wishlist wish = wishlistRepository.findByUser(username).get();
            wish.removeBook(isbn);
        }
        return "deleted";
    }
}