package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		//1.전체조회, 2.한건조회, 3.등록, 4. 삭제
		
		
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServiceImpl();
		while(true) {
			System.out.println("==========================================");
			System.out.println("1.전체리스트 | 2.검색 | 3.등록 | 4.삭제 | 5.수정");
			System.out.println("==========================================");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();scn.nextLine();
			if(selectNo == 1) {
				  List list = service.getBoardList();
				  for(Object vo: list) {
					  BoardVO bd = (BoardVO) vo;
					  bd.showBoardInfo();
				  }
				
			}else if(selectNo == 2) {
				System.out.println("번호검색> ");
				int bdno = scn.nextInt();
				BoardVO vo = service.getBoardNo(bdno);
				vo.showBoardInfo();
			}else if(selectNo == 3) {
				
				
				System.out.print("번호: ");
				int boardNo = scn.nextInt();scn.nextLine();
				System.out.print("제목: ");
				String title = scn.nextLine();
				System.out.print("내용: ");
				String content = scn.nextLine();
				System.out.print("작성자: ");
				String writer = scn.nextLine();
//				System.out.print("작성일자: ");
//				String creationDate = scn.nextLine();

				BoardVO vo = new BoardVO();
				vo.setBoardNo(boardNo);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
//				vo.setCreationDate(creationDate);
				
				service.insertBoard(vo);
				
			}else if(selectNo == 4) {
				System.out.println("삭제할번호: ");
				int bdNo = scn.nextInt();	
				service.deleteBoard(bdNo);
			}else if(selectNo == 5) {
				System.out.println("수정할 사원번호:");
				int boardNo = scn.nextInt();scn.nextLine();
				System.out.print("수정할 제목: ");
				String title = scn.nextLine();
				System.out.print("수정할 내용: ");
				String content = scn.nextLine();
				System.out.print("수정할 작성자: ");
				String writer = scn.nextLine();
				
				BoardVO vo = new BoardVO();
				vo.setBoardNo(boardNo);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
				
				service.updateBoard(vo);
			}
			System.out.println();
		}

	}

}
