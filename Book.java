package Assignment4;

public class Book {
	private float price;
	private String author;
	private int booknumber;
	private String title;
	
	
	public int getBookNumber() {
		return booknumber;
	}
	public void setBookNumber(int booknumber) {
		this.booknumber = booknumber;
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
	public void setPrice(float price) {
		this.price = price;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	








package Assignment4;

import java.util.Scanner;
public class BookDetails {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Book obj=new Book();
		System.out.println("enter book title");
		obj.setTitle(scan.nextLine());
		System.out.println("enter book Author");
		obj.setAuthor(scan.nextLine());
		System.out.println("enter book number");
		obj.setBookNumber(scan.nextInt());
		System.out.println("enter book Price");
		obj.setPrice(scan.nextFloat());
		System.out.println("Book Number: "+obj.getBookNumber()+"\nBook Title: "+obj.getTitle()+"\nBook Author"+obj.getAuthor()+"\nBook Price: "+obj.getPrice());
		scan.close();
	}

}
















package Assignment4;

public class EngineeringBook extends Book {
	private String category;
	

}





