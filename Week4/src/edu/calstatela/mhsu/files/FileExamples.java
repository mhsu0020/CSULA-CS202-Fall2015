package edu.calstatela.mhsu.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileExamples {

	public static void main(String[] args) {
		//Creates a file, if file doesn't exist. Appends to end of file, if file doesn't exist
		Path path = Paths.get("C:\\Users\\Michael\\Desktop\\CS202ExamplesMadeUp.txt");
		Charset charset = Charset.forName("US-ASCII");
		String[] contentsToWrite = {"This is line 7", "This is line 8"};
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
			for (int i = 0; i < contentsToWrite.length; i++) {
				writer.write(contentsToWrite[i]);
				writer.newLine();
			}
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}


	}

}
