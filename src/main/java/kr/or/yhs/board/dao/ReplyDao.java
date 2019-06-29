package kr.or.yhs.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.yhs.board.model.ReplyVo;

@Repository
public class ReplyDao implements IReplyDao{
	private IReplyDao replyDao;

	@Override
	public List<ReplyVo> replyList(int postnum) {
		return replyDao.replyList(postnum);
	}

	@Override
	public int insertReply(ReplyVo replyVo) {
		return replyDao.insertReply(replyVo);
	}

	@Override
	public int deleteReply(int replynum) {
		return replyDao.deleteReply(replynum);
	}
}
