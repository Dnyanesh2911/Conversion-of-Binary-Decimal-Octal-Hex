package conversionBDOH;

//Convert Decimal to Octal
public class CdecimalTooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Decimal to Octal***");
		
		//Using toOctalString of Integer class
		System.out.println("Using toOctalString of Integer class");
		
		int dnum = 123;
		System.out.println("Decimal no. : " + dnum + "\nOctal : " + Integer.toOctalString(dnum));
		
		//Without using predefined method
		System.out.println("Without using predefined method");
		
		dnum = 133;
		int rem;
		String ostr = " ";
		char octal[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
		
		System.out.println("Decimal no. : " + dnum);
		
		while(dnum > 0) {
			rem = dnum % 8;
			ostr = octal[rem] + ostr;
			dnum = dnum / 8;
		}
		System.out.println("Octal : " + ostr);
	}

}

/*
***Conversion of Decimal to Octal***
Using toOctalString of Integer class
Decimal no. : 123
Octal : 173
Without using predefined method
Decimal no. : 133
Octal : 205 
 */