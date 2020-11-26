package com.yedam.board;

public class BoardVO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String creationDate;
	
	
	public BoardVO() {		
	}
	
	public BoardVO(int boardNo, String title, String content, String writer, String creationDate) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.creationDate = creationDate;
	}
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	public void showBoardInfo() {
		System.out.println(
				"글번호:" + boardNo + " | 제목: " + title +" | 내용: " + content
				+ " | 작성자: " + writer +" | 작성일자: " + creationDate);
	}
	
	
}
