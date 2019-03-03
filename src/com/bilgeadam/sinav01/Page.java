package com.bilgeadam.sinav01;

public class Page {
	private int no;
	private String content;
	
	public Page(int no, String content) {
		super();
		this.no = no;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void getInfo() {
		System.out.println("Page no :" + this.no + ", Content : " + this.content);
	}
}
