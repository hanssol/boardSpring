package kr.or.yhs.board.service;

import java.util.List;

import kr.or.yhs.board.model.FileVo;

public interface IFileService {
	List<FileVo> fileList(int postnum);
	
	FileVo fileDown(int attachmentid);
	
	int fileCnt();
	
	int insertFile(FileVo fileVo);
	
	int insertFileEdit(FileVo fileVo);
	
	int deleteFile(int attachmentid);
}
