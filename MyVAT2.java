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
		
		double[] revenue = {0.5, 0.3, 0.2};
		double[] revenueUnder10000 = {1, 0, 0};
		
		// 만약 supplyValue가 10000원보다 크다면 
		if(supplyValue > 10000.0) {
			for(int i=0; i<revenue.length; i++) {
				System.out.println("Person : " + (supplyValue * revenue[i]) );
			}
		} else {
			for(int i=0; i<revenueUnder10000.length; i++) {
				System.out.println("Person : " + (supplyValue * revenueUnder10000[i]) );
			}
		}
	}

}
