package conversionBDOH;

//Convert Hexadecimal to Decimal
public class ChexTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Hexadecimal to Decimal***");
				
		//Using Integer.parseInt() 
		System.out.println("Using Integer.parseInt()");
		
		String hexnum = "6F";
		System.out.println("Hexadecimal : " + hexnum + "\nDecimal no. : " + Integer.parseInt(hexnum,16));
		
		//Without using predefined method
		System.out.println("Without using predefined method");
		
		hexnum = "7A";
		String hstr = "0123456789ABCDEF";
		int dnum = 0;
				
		for(int i = 0; i < hexnum.length(); i++) {
			char ch = hexnum.charAt(i);
			int n = hstr.indexOf(ch);
			dnum = 16 * dnum + n;
		}
		System.out.println("Hexadecimal : " + hexnum + "\nDecimal no. : " + dnum);
	}

}

/*
***Conversion of Hexadecimal to Decimal***
Using Integer.parseInt()
Hexadecimal : 6F
Decimal no. : 111
Without using predefined method
Hexadecimal : 7A
Decimal no. : 122
 */