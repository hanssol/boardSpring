package kr.or.yhs.board.service;

import java.util.List;

import kr.or.yhs.board.model.ReplyVo;

public interface IReplyService {
	int insertReply(ReplyVo replyVo);
	
	List<ReplyVo> replyList(int postnum);
	
	int deleteReply(int replynum);
}
