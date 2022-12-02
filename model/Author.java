package com.wishlist.wishlist.model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String firstName;

	private String lastName;

	private String biography;

	private String publisher;

	public Author(String firstName, String lastName, String biography, String publisher) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.biography = biography;
		this.publisher = publisher;
	}

	public Author() {

	}

	public Integer getId(){
		return id;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getBiography(){
		return biography;
	}

	public void setBiography(String biography){
		this.biography = biography;
	}

	public String getPublisher(){
		return publisher;
	}

	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
}
