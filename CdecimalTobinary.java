package conversionBDOH;

//Convert Decimal to Binary
public class CdecimalTobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Decimal to Binary***");
		
		//Using toBinaryString of Integer class
		System.out.println("Using toBinaryString of Integer class");
		
		int dnum = 124;
		System.out.println("Decimal no. : " + dnum + "\nBinary : " + Integer.toBinaryString(dnum));
		
		//Without using predefined method
		System.out.println("Without using predefined method");
		
		dnum = 25;
		int binary[] = new int[40];
		int index = 0;
		
		System.out.print("Decimal no. : " + dnum + "\nBinary : ");
		
		while(dnum > 0) {
			binary[index++] = dnum % 2;
			dnum = dnum / 2;			
		}
		
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

}
