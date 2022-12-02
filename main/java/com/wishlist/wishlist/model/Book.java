package com.wishlist.wishlist.model;

import javax.persistence.*;

import com.wishlist.wishlist.model.Author;

@Entity // This tells Hibernate to make a table out of this class
public class  Book {
	//ISBN, book
	//name, book description, price, author, genre, publisher , year published and
	//copies sold.
	@Id
	private Integer id; //ISBN

	private String title;

	private String description;

	private Double price;

	private String firstname;

	private String lastname;

	private String genre;

	private String publisher;

	private Integer yearPublished;

	private Integer copiesSold;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String title) {
		this.title = title;
	}

	public String getName() {
		return title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setAuthorFirstName(String authorFirst) {
		this.firstname = authorFirst;
	}

	public String getAuthorFirstName() {
		return firstname;
	}

	public void setAuthorLastName(String authorLast) {
		this.lastname = authorLast;
	}

	public String getAuthorLastName() {
		return lastname;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public Integer getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(Integer yearsPublished) {
		this.yearPublished = yearsPublished;
	}

	public Integer getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(Integer copiesSold) {
		this.copiesSold = copiesSold;
	}
}
