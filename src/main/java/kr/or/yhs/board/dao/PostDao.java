package kr.or.yhs.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.yhs.board.model.PostVo;
import kr.or.yhs.paging.model.PageVo;

@Repository
public class PostDao implements IPostDao {
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
	public List<PostVo> postPagingList(PageVo pageVo) {
		return postDao.postPagingList(pageVo);
	}

	@Override
	public List<PostVo> boardPostPagingList(PageVo pageVo) {
		return postDao.boardPostPagingList(pageVo);
	}

	@Override
	public int postCnt() {
		return postDao.postCnt();
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
