package kr.or.yhs.board.service;

import java.util.List;

import kr.or.yhs.board.model.BoardVo;

public interface IBoardService {

	int insertBoard(BoardVo boardVo);
	
	List<BoardVo> boardList();
	
	List<BoardVo> boardListYes(String use_yn);
	
	BoardVo boardInfo(int boardnum);
	
	int updateBoard(BoardVo boardVo);
}
