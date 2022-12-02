package com.wishlist.wishlist.model;
import javax.persistence.*;


@Entity // This tells Hibernate to make a table out of this class
public class  Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String value;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
