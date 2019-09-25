import java.io.FileWriter;
import java.io.IOException;

public class MyMethodApp {

	public static void main(String[] args) throws IOException {
		//..
		System.out.println(twoTimes("---","A"));
		System.out.println(twoTimes("***","B"));
		System.out.println(twoTimes("###","C"));
		
		FileWriter f1 = new FileWriter("result1.txt");
		f1.write("f1");
		
		
		FileWriter f2 = new FileWriter("result2.txt");
		f2.write("f2");
		
		f1.close();
		f2.close();
		
		

	}

	private static String twoTimes(String delimiter, String text) {
		return delimiter + "\n" + text + "\n" + text;
	}
	private static void printVoice(String delimiter, String text) {
		
	}
	

}
