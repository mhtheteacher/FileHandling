package com.ioFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class FileExample {

	public static void main(String[] args) {
		
		File myFile= new File("testFile1.txt");
		try {
			if (myFile.createNewFile())
			{
				System.out.println("File created!");
			}
			else
			{
				System.out.println("File already exists!");
			}
			
			if (myFile.exists())
			{
				System.out.println("File Name: "+myFile.getName());
				System.out.println("File Location: "+myFile.getAbsolutePath());
				System.out.println("File Length: "+myFile.length());
			}
			else 
			{
				System.out.println("File doesn't exists!");
			}
			writeToFile("testFile1.txt");
			readFromFile("testFile1.txt");


		} catch (IOException e) {
			System.out.println("IOException: "+e.toString());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception: "+e.toString());
			e.printStackTrace();
		}
	}
	
	public static void writeToFile (String fileName)
	{
		try {
			FileWriter myWriter= new FileWriter(fileName);
			myWriter.write("This is a file created and written by FileWriter.");
			myWriter.close();
			System.out.println("Wrote Successfully!");	
		} 
		catch (IOException e) {
			System.out.println("IOException in writeToFile: "+e.toString());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception in writeToFile: "+e.toString());
			e.printStackTrace();
		}
	}
	public static void readFromFile(String fileName)
	{
		try {
			
			FileReader myReader= new FileReader (fileName);
			char[] myReaderData= new char [1000];
			if (myReader.ready()) {
				myReader.read(myReaderData);
				System.out.println(myReaderData);
			}
			
		} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException in readFromFile: "+e.toString());
		} catch (IOException e) {
			System.out.println("IOException in readFromFile: "+e.toString());	
		}
		
		
	}
	
		
	
}
