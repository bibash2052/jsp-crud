package com.crud;

public class Book {
	protected int id;
	protected String bookName;
	protected String authorName;
	protected int price;
	
	public Book() {}	
	
	public Book(int id) {
		id = this.id;
	}
	
	public Book(int id, String title, String author, int price) {
        this(title, author, price);
        this.id = id;
    }
	
	public Book(String bookName, String authorName, int price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
