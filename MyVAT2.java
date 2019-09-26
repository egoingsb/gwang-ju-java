import javax.swing.JOptionPane;

public class MyVAT2 {

	public static void main(String[] args) {
		String inputTotal = JOptionPane.showInputDialog("Please input total : ");
		double total = Double.parseDouble(inputTotal);
		double VAT = total * 0.1;
		double supplyValue = total - VAT;
		
		System.out.println("Total : " + total);
		System.out.println("VAT : " + VAT);
		System.out.println("Supply Value : " + supplyValue);
		
		// 만약 supplyValue가 10000원보다 크다면 
		if(supplyValue > 10000.0) {
			System.out.println("Person1 : " + supplyValue * 0.5);
			System.out.println("Person2 : " + supplyValue * 0.3);
			System.out.println("Person3 : " + supplyValue * 0.2);
		} else {
			System.out.println("Person1 : " + supplyValue * 1);
			System.out.println("Person2 : " + supplyValue * 0);
			System.out.println("Person3 : " + supplyValue * 0);
		}
	}

}
