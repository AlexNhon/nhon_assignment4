package nhon_problem2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class DuplicateCounter {
	Scanner scan;
	Map<String, Integer> wordCounter = new HashMap<String, Integer>();
	public void count(String dataFile) {
		File file = new File(dataFile);
		try {
			scan = new Scanner(file);
			String currentWord;
			while (scan.hasNext()) {
				currentWord = scan.next().toLowerCase();
				if(wordCounter.get(currentWord) == null) {
					wordCounter.put(currentWord, 1);
				}
				else {
					wordCounter.put(currentWord, wordCounter.get(currentWord) + 1);;
				}
			} 
		}catch (IOException e) {
			System.out.println("Something went wrong. :^(");
		}
		
	}
	public void write(String outputFile) {
		File file = new File(outputFile);
	    try {
	    	   PrintWriter writer = new PrintWriter(file);
			   scan = new Scanner(file);
			   for (String word : wordCounter.keySet()) {
				   writer.println(word + ": " + wordCounter.get(word));
			   }
			   writer.close();
		   } catch(IOException e) {
			   System.out.println("Something went wrong. :^(");
		   }
	}
}
