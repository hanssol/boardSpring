package kr.or.yhs.board.dao;

import java.util.List;

import kr.or.yhs.board.model.FileVo;

public interface IFileDao {
	List<FileVo> fileList(int postnum);
	
	FileVo fileDown(int attachmentid);
	
	int fileCnt();
	
	int insertFile(FileVo fileVo);
	
	int insertFileEdit(FileVo fileVo);
	
	int deleteFile(int attachmentid);
}
