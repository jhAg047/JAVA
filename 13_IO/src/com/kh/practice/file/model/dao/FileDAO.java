package com.kh.practice.file.model.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		boolean b = true;
		return b;
	}
	public void fileSave(String file,String s) {
		try(FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder(file);
		return sb; 
	}
	public void fileEdit(String file, String s) {
		
	}
}
