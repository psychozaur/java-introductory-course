package com.podstaw.od.java.rybicki.marcin.io.file_copy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopier {

	private File copyFrom;
	private File copyTo;
	
	public TextFileCopier(File copyFrom, File copyTo){
		this.copyFrom = copyFrom;
		this.copyTo = copyTo;
	}
	
	public void copy() {
		
		FileReader reader = null;
		FileWriter writer = null;
		int readChar;
		
		try {
			reader = new FileReader(copyFrom);
			writer = new FileWriter(copyTo);
			
			while((readChar = reader.read()) != -1){
				writer.write((char) readChar);
			}

			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != writer){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != reader){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}



		}
		
		
		
	}
}
