package kr.or.yhs.board.dao;

import java.util.List;

import kr.or.yhs.board.model.ReplyVo;

public interface IReplyDao {
	List<ReplyVo> replyList(int postnum);
	
	int insertReply(ReplyVo replyVo);
	
	int deleteReply(int replynum);
}
