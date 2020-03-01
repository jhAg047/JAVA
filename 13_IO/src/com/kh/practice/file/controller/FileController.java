package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		boolean b = fd.checkName(file);
		return b;
	}
	public void fileSave(String file,StringBuilder sb) {
		String str = sb+"";
		fd.fileSave(file, str);
	}
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	public void fileEdit(String file,StringBuilder sb) {
		String str = sb+"";
		fd.fileEdit(file, str);
	}
}
