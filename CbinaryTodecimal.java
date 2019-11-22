package conversionBDOH;

//Convert Binary to Decimal
public class CbinaryTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Binary to Decimal***");
		
		//Using Integer.parseInt() 
		System.out.println("Using Integer.parseInt()");
		
		String bnum = "1101";
		System.out.println("Binary : " + bnum + "\nDecimal no. : " + Integer.parseInt(bnum,2));
		
		//Without using predefined method
		System.out.println("Without using predefined method");
		
		int decimal = 0;
		int p = 0;
		int b = 1111;
		System.out.println("Binary : " + b);
		
		while(true) {
			if(b == 0) {
				break;
			}
			else {
				int temp = b % 10;
				decimal += temp * Math.pow(2,p);
				b = b / 10;
				p++;
			}
		}
		System.out.println("Decimal no. : " + decimal);
		
	}
}

/*
***Conversion of Binary to Decimal***
Using Integer.parseInt()
Binary : 1101
Decimal no. : 13
Without using predefined method
Binary : 1111
Decimal no. : 15
*/
