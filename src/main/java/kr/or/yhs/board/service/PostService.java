package kr.or.yhs.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.yhs.board.dao.IPostDao;
import kr.or.yhs.board.model.PostVo;
import kr.or.yhs.paging.model.PageVo;

@Service
public class PostService implements IPostService{

	@Resource(name="postDao")
	private IPostDao postDao;

	@Override
	public int insertPost(PostVo postVo) {
		return postDao.insertPost(postVo);
	}

	@Override
	public List<PostVo> postList() {
		return postDao.postList();
	}

	@Override
	public PostVo postInfo(int postnum) {
		return postDao.postInfo(postnum);
	}

	@Override
	public Map<String, Object> postPagingList(PageVo pageVo) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("postList", postDao.postPagingList(pageVo));
		
		int postCnt = postDao.postCnt();
		
		int paginationSize = (int) Math.ceil((double)postCnt/pageVo.getPageSize());
		resultMap.put("paginationSize", paginationSize);
		
		return resultMap;
	}

	@Override
	public Map<String, Object> boardPostPagingList(PageVo pageVo) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("postList", postDao.boardPostPagingList(pageVo));
		
		int postCnt = postDao.postCnt();
		
		int paginationSize = (int) Math.ceil((double)postCnt/pageVo.getPageSize());
		resultMap.put("paginationSize", paginationSize);
		
		return resultMap;
	}

	@Override
	public int updatePost(PostVo postVo) {
		return postDao.updatePost(postVo);
	}

	@Override
	public int deletePost(PostVo postVo) {
		return postDao.deletePost(postVo);
	}
	
	
}
