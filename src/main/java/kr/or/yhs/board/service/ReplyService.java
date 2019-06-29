package kr.or.yhs.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.yhs.board.dao.IReplyDao;
import kr.or.yhs.board.model.ReplyVo;

@Service
public class ReplyService implements IReplyService{
	
	@Resource(name="replyDao")
	private IReplyDao replyDao;

	@Override
	public int insertReply(ReplyVo replyVo) {
		return replyDao.insertReply(replyVo);
	}

	@Override
	public List<ReplyVo> replyList(int postnum) {
		return replyDao.replyList(postnum);
	}

	@Override
	public int deleteReply(int replynum) {
		return replyDao.deleteReply(replynum);
	}
}
