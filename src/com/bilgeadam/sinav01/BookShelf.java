package com.bilgeadam.sinav01;

public class BookShelf implements I_PickUp{
	private Book[] books;

	public BookShelf(Book[] books) {
		super();
		this.books = books;
	}

	@Override
	public void pickUpBook(int index) {
		try {
			books[index].getInfo();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Bu Numarali kitap sayisi yok");
		}
	}
	
}
