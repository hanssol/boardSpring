package kr.or.yhs.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.yhs.board.model.FileVo;

@Repository
public class FileDao implements IFileDao{
	private IFileDao fileDao;

	@Override
	public List<FileVo> fileList(int postnum) {
		return fileDao.fileList(postnum);
	}

	@Override
	public FileVo fileDown(int attachmentid) {
		return fileDao.fileDown(attachmentid);
	}

	@Override
	public int fileCnt() {
		return fileDao.fileCnt();
	}

	@Override
	public int insertFile(FileVo fileVo) {
		return fileDao.insertFile(fileVo);
	}

	@Override
	public int insertFileEdit(FileVo fileVo) {
		return fileDao.insertFileEdit(fileVo);
	}

	@Override
	public int deleteFile(int attachmentid) {
		return fileDao.deleteFile(attachmentid);
	}
}
