package main;

import java.util.function.Consumer;

import main.Book.Cover;

public class MainClass {

	public static void main(String[] args) {
		
		Cover cover = new Book(). new Cover("blue","Cover Page Text");
		
		Book book = new Book("Book 1",2010,cover);
		
		//Cover cover2 = book.new Cover();
		
		System.out.println(book);
		
		IntroPage introPage = new IntroPage(1, "Intro page bottom text");
		
		book.addPage(introPage);
		
		
		
		//Anonymous inner class
		
		book.addPage(new Page() {

			@Override
			public String getContent() {
				return "second page..";
			}
			
		});
		
		book.addPage(new Page() {
			
			@Override
			public String getContent() {
				return "third page..";
			}
		});
		
		book.listPages();
		
		//using a lambda expression to add a page:
		
		book.addPage(()->{
			int d = 100;
			return "fourth page";
		});
		
		book.addPage(()-> "fifth page.." );
		
		book.listPages();
		
		
		for(Page page: book.getPages()) {
			System.out.println(page.getContent());
		}
		
		System.out.println("-----------------");
		
		book.getPages().forEach(new Consumer<Page>() {

			@Override
			public void accept(Page t) {
				System.out.println(t.getContent());
				
			}
			
			
		});
		
		System.out.println("---------------");
		
		book.getPages().forEach(p->System.out.println(p.getContent()) );
		
	}
	
	
}
