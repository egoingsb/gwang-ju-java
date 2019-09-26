import javax.swing.JOptionPane;

public class MyVAT2 {

	public static void main(String[] args) {
		String inputTotal = JOptionPane.showInputDialog("Please input total : ");
		double total = Double.parseDouble(inputTotal);
		double VAT = 10000.0 * 0.1;
		double supplyValue = total - VAT;
		
		System.out.println("Total : " + total);
		System.out.println("VAT : " + VAT);
		System.out.println("Supply Value : " + supplyValue);
		
		System.out.println("Person1 : " + supplyValue * 0.5);
		System.out.println("Person2 : " + supplyValue * 0.3);
		System.out.println("Person3 : " + supplyValue * 0.2);
	}

}
