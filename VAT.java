class Tax{
	/*
	Tax tax1 = new Tax(10000.0);
	tax1.print();
	 */
	public double total;
	public static double ratio;
	public Tax(double _total){
		total = _total;
	}
	public double supplyValue() {
		double supplyValue = total - VAT();
		return supplyValue;
	}
	public double VAT() {
		double VAT = (total*ratio);
		return VAT;
	}
	public void print() {
		System.out.println("total:"+total);
		System.out.println("VAT:"+VAT());
		System.out.println("supply value:"+supplyValue());
	}
}
public class VAT {
	public static void main(String[] args) {
		Tax.ratio = 0.1;
		
		Tax tax1 = new Tax(10000.0);
		tax1.print();
		
		Tax tax2 = new Tax(20000.0);
		tax2.print();
		
		tax1.print();
		tax2.print();
	}
	
	

}
