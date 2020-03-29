package nhon_problem1;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;


public class DuplicateRemover {
	Scanner scan;
	Set<String> uniqueWords = new HashSet<String>();

   public void remove(String dataFile) {
	   File file = new File(dataFile);
	   try {
		   scan = new Scanner(file);
		   while (scan.hasNext()) {
			   uniqueWords.add(scan.next().toLowerCase());
		   }
		   scan.close();
	   } catch(IOException e) {
		   System.out.println("Something went wrong. :^(");
	   }
   }

   public void write(String outputFile) {
	   File file = new File(outputFile);
	    try {
	    	   PrintWriter writer = new PrintWriter(file);
			   scan = new Scanner(file);
			   for (String uniqueWords : uniqueWords) {
				   writer.println(uniqueWords);			   
			   }
			   writer.close();
		   } catch(IOException e) {
			   System.out.println("Something went wrong. :^(");
		   }
   }
}
