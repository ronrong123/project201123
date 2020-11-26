package com.yedam.board;

import java.util.List;

public class BoardServiceImpl implements BoardService {
	
	BoardDAO bd = new BoardDAO();

	@Override
	public List getBoardList() {
		return bd.getBoardList();
	}

	@Override
	public BoardVO getBoardNo(int bdNo) {
		return bd.getbd(bdNo);
	}

	@Override
	public void insertBoard(BoardVO bdVo) {
		bd.inserBd(bdVo);
	}

	@Override
	public void deleteBoard(int bdNo) {
		bd.deleteBd(bdNo);
		
	}

	@Override
	public void updateBoard(BoardVO bdVo) {	
		bd.updateBd(bdVo);
	}

}
