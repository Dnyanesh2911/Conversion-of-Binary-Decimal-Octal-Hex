package conversionBDOH;

//Convert Decimal to Hexadecimal
public class CdecimalTohex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Decimal to Hexadecimal***");
		
		//Using toHexString of Integer class
		System.out.println("Using toHexString of Integer class");
		
		int dnum = 123;
		System.out.println("Decimal no. : " + dnum + "\nHexadecimal : " + Integer.toHexString(dnum));
		
		//Without using predefined method
		System.out.println("Without using predefined method");
		
		dnum = 155;
		int rem;
		String hstr = " ";
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println("Decimal no. : " + dnum);
		
		while(dnum > 0) {
			rem = dnum % 16;
			hstr = hex[rem] + hstr;
			dnum = dnum / 16;
		}
		System.out.print("Hexadecimal : " + hstr);
	}

}

/*
***Conversion of Decimal to Hexadecimal***
Using toHexString of Integer class
Decimal no. : 123
Hexadecimal : 7b
Without using predefined method
Decimal no. : 155
Hexadecimal : 9B 
*/
