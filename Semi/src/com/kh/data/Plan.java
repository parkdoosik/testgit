package com.kh.data;

public class Plan {

	private String title;
	private String writer;
	private int stDay;
	private int enDay;
	
	public Plan() {}
	
	public Plan(String title, String writer, int stDay, int enDay) {
		this.title = title;
		this.writer = writer;
		this.stDay = stDay;
		this.enDay = enDay;		
	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getStDay() {
		return stDay;
	}

	public void setStDay(int stDay) {
		this.stDay = stDay;
	}

	public int getEnDay() {
		return enDay;
	}

	public void setEnDay(int enDay) {
		this.enDay = enDay;
	}

}
