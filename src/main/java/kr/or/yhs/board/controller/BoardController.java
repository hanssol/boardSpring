package kr.or.yhs.board.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import kr.or.yhs.board.dao.IReplyDao;
import kr.or.yhs.board.service.IBoardService;
import kr.or.yhs.board.service.IFileService;
import kr.or.yhs.board.service.IPostService;
import kr.or.yhs.board.service.IReplyService;

@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Resource(name="boardService")
	private IBoardService boardService;
	
	@Resource(name="fileService")
	private IFileService fileService;
	
	@Resource(name="postService")
	private IPostService postService;
	
	@Resource(name="replyService")
	private IReplyService replyService;
	
	
	
}
