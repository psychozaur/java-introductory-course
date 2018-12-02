package com.podstaw.od.java.rybicki.marcin.io.file_copy;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String filePath = new File("").getAbsolutePath();
		String filePath1 = filePath.concat("/src/main/java/com/podstaw/od/java/rybicki/marcin/io/file_copy/copyFrom");
		String filePath2 = filePath.concat("/src/main/java/com/podstaw/od/java/rybicki/marcin/io/file_copy/copyTo");
		
		File file1 = new File(filePath1);
		File file2 = new File(filePath2);
		
		TextFileCopier fileCopy = new TextFileCopier(file1, file2);
		fileCopy.copy();
		
	}

}
