package kr.or.yhs.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.yhs.board.dao.IFileDao;
import kr.or.yhs.board.model.FileVo;

@Service
public class FileService implements IFileService{
	
	@Resource(name="fileDao")
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
