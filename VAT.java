
public class VAT {

	public static void main(String[] args) {
		double total =  Double.parseDouble(args[0]);
		double VAT = (total*0.1);
		double supplyValue = total - VAT;
		
		double person1 = supplyValue*0.5;
		double person2 = supplyValue*0.3;
		double person3 = supplyValue*0.2;
		
		System.out.println("합계:"+total);
		System.out.println("부가가치세:"+VAT);
		System.out.println("공급가액:"+supplyValue);
		
		System.out.println("동업자1:"+person1);
		System.out.println("동업자2:"+person2);
		System.out.println("동업자3:"+person3);
		
		//Bank.send("동업자1의 계좌번호", person1);
		//Bank.send("동업자2의 계좌번호", person2);
		//Bank.send("동업자3의 계좌번호", person2);
	}

}
