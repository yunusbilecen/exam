package com.bilgeadam.sinav01;

public class Test {

	public static void main(String[] args) {
		Page page1 = new Page(1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.1");
		Page page2 = new Page(2, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.2");
		Page page3 = new Page(3, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.3");
		Page page4 = new Page(4, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.4");
		Page page5 = new Page(5, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.5");
		
		Page [] pages1 = new Page[]{page1, page2, page3, page4, page5};
		
		Chapter chapter1 = new Chapter(1, "Chapter 1", pages1);
		
		Page page6 = new Page(6, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.6");
		Page page7 = new Page(7, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.7");
		Page page8 = new Page(8, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.8");
		Page page9 = new Page(9, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.9");
		Page page10 = new Page(10, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.10");
		
		Page [] pages2 = new Page[]{page6, page7, page8, page9, page10};
		
		Chapter chapter2 = new Chapter(2, "Chapter 2", pages2);
		
		Chapter[] cpahters = new Chapter[] {chapter1, chapter2};
		
		Book book1 = new Book("Harry Potter and the Philosopher Stone", cpahters);
		
		
		
		
		
		Page page11 = new Page(1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 1_2");
		Page page12 = new Page(2, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 2_2");
		Page page13 = new Page(3, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 3_2");
		Page page14 = new Page(4, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 4_2");
		Page page15 = new Page(5, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 5_2");
		
		Page [] pages3 = new Page[]{page11, page12, page13, page14, page15};
		
		Chapter chapter3 = new Chapter(1, "Chapter 1", pages3);
		
		Page page16 = new Page(6, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 6_2");
		Page page17 = new Page(7, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 7_2");
		Page page18 = new Page(8, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 8_2");
		Page page19 = new Page(9, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 9_2");
		Page page20 = new Page(10, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 10_2");
		
		Page [] pages4 = new Page[]{page16, page17, page18, page19, page20};
		
		Chapter chapter4 = new Chapter(2, "Chapter 2", pages4);
		
		Chapter[] cpahters2 = new Chapter[] {chapter3, chapter4};
		
		Book book2 = new Book("The Lord of the Rings: The Fellowship of the Ring", cpahters2);
		
		Book[] books = new Book[] {book1, book2}; 
		
		BookShelf bookShelf = new BookShelf(books);
		
		bookShelf.pickUpBook(0);
		System.out.println();
		bookShelf.pickUpBook(1);
		bookShelf.pickUpBook(2);
	}

}
