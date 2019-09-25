
public class VAT {

	public static void main(String[] args) {
		double total =  Double.parseDouble(args[0]);
		double ratio = 0.1;
		double VAT = taxVAT(total, ratio);
		double supplyValue = taxSupplyValue(total, VAT);
		taxPrint(total, VAT, supplyValue);
		
	}

	public static void taxPrint(double total, double VAT, double supplyValue) {
		System.out.println("total:"+total);
		System.out.println("VAT:"+VAT);
		System.out.println("supply value:"+supplyValue);
	}

	public static double taxSupplyValue(double total, double VAT) {
		double supplyValue = total - VAT;
		return supplyValue;
	}

	public static double taxVAT(double total, double ratio) {
		double VAT = (total*ratio);
		return VAT;
	}

}
