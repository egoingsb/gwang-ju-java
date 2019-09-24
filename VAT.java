
public class VAT {

	public static void main(String[] args) {
		double total =  Double.parseDouble(args[0]);
		double VAT = (total*0.1);
		double supplyValue = total - VAT;
		
		double person1 = supplyValue*0.5;
		double person2 = supplyValue*0.3;
		double person3 = supplyValue*0.2;
		
		System.out.println("total:"+total);
		System.out.println("VAT:"+VAT);
		System.out.println("supply value:"+supplyValue);
		
		System.out.println("person 1:"+person1);
		System.out.println("person 2:"+person2);
		System.out.println("person 3:"+person3);
		
	}

}
