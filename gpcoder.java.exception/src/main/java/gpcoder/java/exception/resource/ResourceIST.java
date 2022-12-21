package gpcoder.java.exception.resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceIST {

	public static void main(String[] args) {
		final String FILE_PATH = "raw.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
			System.out.println("Many Process Here...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
