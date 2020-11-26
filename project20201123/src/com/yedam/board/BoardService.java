package com.yedam.board;

import java.util.List;

public interface BoardService {
	public List getBoardList();//리스트
	public BoardVO getBoardNo(int bdNo);//상세번호
	public void insertBoard(BoardVO bdVo);//등록
	public void deleteBoard(int bdNo);//삭제
	public void updateBoard(BoardVO bdVo);//수정
}
