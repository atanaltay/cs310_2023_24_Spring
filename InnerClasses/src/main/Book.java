package main;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String title;
	private int year;
	private Cover cover;
	
	private List<Page> pages = new ArrayList<>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	//Non-static member class:
	
	public Book(String title, int year, Cover cover) {
		super();
		this.title = title;
		this.year = year;
		this.cover = cover;
	}


	public void addPage(Page page) {
		this.pages.add(page);
	}

	public void listPages() {
		
		for (Page page : pages) {
			System.out.println(page.getContent());
		}
		
		
	}
	

	 class Cover{
		private String color;
		private String text;
		
		public Cover() {
			
		}

		public Cover(String color, String text) {
			super();
			this.color = color;
			this.text = text;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		@Override
		public String toString() {
			return "Cover: text is " + text;
		}
		
		
	}




	@Override
	public String toString() {
		return "Book [title=" + title + ", year=" + year + ", cover=" + cover + "]";
	}
	
	public List<Page> getPages() {
		return pages;
	}
	
	
}
