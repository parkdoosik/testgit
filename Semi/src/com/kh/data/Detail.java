package com.kh.data;

public class Detail {

	private String title;
	private String detail;
	private String progress;
	private int time;
	
	public Detail() {}
	
	public Detail(String title, String detail, String progress, int time) {
		this.title = title;
		this.detail = detail;
		this.progress = progress;
		this.time = time;
		
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
}
