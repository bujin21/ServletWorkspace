package com.kh.action.model.vo;

import java.util.Date;

public class Board {
	private int bno;
	private String title;
	private String writer;
	private String date;
	
	public Board() {
		
	}
	public Board(int bno, String title, String writer, String date) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.date = date;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", writer=" + writer + ", date=" + date + "]";
	}
	
}
