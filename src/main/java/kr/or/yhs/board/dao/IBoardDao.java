package kr.or.yhs.board.dao;

import java.util.List;

import kr.or.yhs.board.model.BoardVo;

public interface IBoardDao {
	/**
	 * 
	 * Method : insertBoard
	 * 작성자 : yang1
	 * 변경이력 : 
	 * @param boardVo
	 * @return
	 * Method 설명 : 게시판 등록
	 */
	int insertBoard(BoardVo boardVo);
	
	/**
	 * 
	 * Method : boardList
	 * 작성자 : yang1
	 * 변경이력 : 
	 * @return
	 * Method 설명 : 전체 게시판 조회
	 */
	List<BoardVo> boardList();
	
	List<BoardVo> boardListYes(String use_yn);
	
	BoardVo boardInfo(int boardnum);
	
	int updateBoard(BoardVo boardVo);
	
	
}
