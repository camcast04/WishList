package com.wishlist.wishlist.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String getHome(){
        return "Home";
    }

    @GetMapping("/test")
    public String getTest(){
        return "Test";
    }

    @GetMapping("/authorSearch")
    public AuthorSearch getAuthorSearch(){

        AuthorSearch a1 = new AuthorSearch();
        a1.setFirstName("Pablo");
        a1.setLastName("Neruda");
        return a1;
    }


}// end test controller class

class AuthorSearch{

    private String FirstName;
    private String LastName;

    public String getFirstName(){
        return FirstName;
    }

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }
}
