package com.wishlist.wishlist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Rating {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private Integer star;

	private String name;

	private String book;

	private String date;

	public void setBook(String book) {
		this.book = book;
	}

	public String getBook() {
		return book;
	}

	public void setUser(String name) {
		this.name = name;
	}

	public String getUser() {
		return name;
	}

	public Integer getStars() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDate(String date) { this.date = date; }

	public String getDate() { return date; }


}
