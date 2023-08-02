package com.dev;

import java.util.Arrays;

public class Book {
	int bookId;
	String bookName;
	String[] bookAuthor;
	double bookCost;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String[] getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String[] bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookCost() {
		return bookCost;
	}
	public void setBookCost(double bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + Arrays.toString(bookAuthor)
				+ ", bookCost=" + bookCost + ", getBookId()=" + getBookId() + ", getBookName()=" + getBookName()
				+ ", getBookAuthor()=" + Arrays.toString(getBookAuthor()) + ", getBookCost()=" + getBookCost()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
