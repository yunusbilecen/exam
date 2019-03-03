package com.bilgeadam.sinav01;
import java.util.Arrays;

public class Book {
	private String title;
	private Chapter[] chapters;
	
	public Book(String title, Chapter[] chapters) {
		super();
		this.title = title;
		this.chapters = chapters;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}
	
	public void getInfo() {
		System.out.println("Book name : " + this.title);
		for (Chapter chapter : chapters) {
			chapter.getInfo();
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(chapters);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (!Arrays.equals(chapters, other.chapters))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
