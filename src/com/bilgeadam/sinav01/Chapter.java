package com.bilgeadam.sinav01;

public class Chapter {
	private int no;
	private String title;
	private Page[] pages;
	
	public Chapter(int no, String title, Page[] pages) {
		super();
		this.no = no;
		this.title = title;
		this.pages = pages;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Page[] getPages() {
		return pages;
	}

	public void setPages(Page[] pages) {
		this.pages = pages;
	}

	public void getInfo() {
		System.out.println("Chapter no: " + this.no + " Chapter title : "+ this.title);
		for (Page page : pages) {
			page.getInfo();
		}
	} 
	
}
