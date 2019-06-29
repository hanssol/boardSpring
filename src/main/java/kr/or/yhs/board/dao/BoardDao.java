package kr.or.yhs.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.yhs.board.model.BoardVo;

@Repository
public class BoardDao implements IBoardDao{
	
	private IBoardDao boardDao;
	
	@Override
	public int insertBoard(BoardVo boardVo) {
		return boardDao.insertBoard(boardVo);
	}

	@Override
	public List<BoardVo> boardList() {
		return boardDao.boardList();
	}

	@Override
	public List<BoardVo> boardListYes(String use_yn) {
		return boardDao.boardListYes(use_yn);
	}

	@Override
	public BoardVo boardInfo(int boardnum) {
		return boardDao.boardInfo(boardnum);
	}

	@Override
	public int updateBoard(BoardVo boardVo) {
		return boardDao.updateBoard(boardVo);
	}

}
