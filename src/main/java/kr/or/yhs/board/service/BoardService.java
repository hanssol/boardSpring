package kr.or.yhs.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.yhs.board.dao.IBoardDao;
import kr.or.yhs.board.model.BoardVo;

@Service
public class BoardService implements IBoardService{
	
	@Resource(name="boardDoa")
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
