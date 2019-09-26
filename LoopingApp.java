
public class LoopingApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		for( int j=0 ; j<3 ; j=j+1 ) {
			System.out.println(2);
			System.out.println(3);
		}
		System.out.println(4);
		
		System.out.println("A");
		int i = 0;
		//..
		while(i < 3) {
			System.out.println("B");
			System.out.println("C");
			//..
			i = i + 1;
		}
		System.out.println("D");
		

	}

}
