package kr.or.yhs.board.service;

import java.util.List;
import java.util.Map;

import kr.or.yhs.board.model.PostVo;
import kr.or.yhs.paging.model.PageVo;

public interface IPostService {
	
	int insertPost(PostVo postVo);
	
	List<PostVo> postList();
	
	PostVo postInfo(int postnum);
	
	Map<String, Object> postPagingList(PageVo pageVo);
	
	Map<String, Object> boardPostPagingList(PageVo pageVo);
	
	int updatePost(PostVo postVo);
	
	int deletePost(PostVo postVo);
}
