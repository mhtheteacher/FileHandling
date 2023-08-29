package com.ioFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePermissions {

	public static void main(String[] args) throws IOException {
		
		File myFile= new File ("testFile2.txt");
		myFile.createNewFile();
		if (myFile.exists())
		{
			myFile.setReadable(true);
			myFile.setWritable(false);
			//check permissions
			System.out.println("File Executable: "+myFile.canExecute());
			System.out.println("File Readable: "+myFile.canRead());
			System.out.println("File Writable: "+myFile.canWrite());
	/*
			FileWriter myfileWriter= new FileWriter(myFile);
		    myfileWriter.write("Hi00000");
		*/
		}
		else
		{
			System.out.println("File doesn't exists");
		}
	}

}
