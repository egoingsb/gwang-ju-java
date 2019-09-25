import java.io.FileWriter;
import java.io.IOException;

public class MyMethodApp {

	public static void main(String[] args) throws IOException {
		//..
		System.out.println(twoTimes("---","A"));
		//..
		FileWriter file1 = new FileWriter("result.txt");
		file1.write(twoTimes("***", "B"));
		file1.close();

	}

	private static String twoTimes(String delimiter, String text) {
		return delimiter + "\n" + text + "\n" + text;
	}
	private static void printVoice(String delimiter, String text) {
		
	}
	

}
