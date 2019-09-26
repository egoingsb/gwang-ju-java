
public class ArrayApp {

	public static void main(String[] args) {
		String[] member = new String[4];
		member[0] = "egoing";
		member[1] = "duru";
		member[2] = "leezche";
		member[3] = "taeho";
		System.out.println(member.length);
		
		for(int i=0; i<member.length; i++) {
			System.out.println(member[i]+"님 ^^");
		}
	}

}
