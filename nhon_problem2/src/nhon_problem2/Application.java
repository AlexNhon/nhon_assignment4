package nhon_problem2;


public class Application {

	public static void main(String[] args) {
		DuplicateCounter duplicteCounter = new DuplicateCounter();
		duplicteCounter.count("problem2.txt");
		duplicteCounter.write("unique_words_count.txt");

	}

}
