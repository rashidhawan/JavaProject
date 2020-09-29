/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal.project;

/**
 *
 * @author Rashi Dhawan
 */
public class book {
     
	int bid;
	String title;
	String author;
	public book(int bid, String title, String author) {
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
	}
	public book(String author) {
		super();
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", author=" + author + "]";
	}
	

}

    

