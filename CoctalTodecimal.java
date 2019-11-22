package conversionBDOH;

//Convert Octal to Decimal
public class CoctalTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Octal to Decimal***");
				
		//Using Integer.parseInt() 
		System.out.println("Using Integer.parseInt()");
		
		String onum = "157";
		System.out.println("Octal : " + onum + "\nDecimal no. : " + Integer.parseInt(onum,8));
		
		//Without using predefined method
		System.out.println("Without using predefined method");
				
		int on = 143; 
		int dnum = 0;
		int p = 0;
		
		System.out.println("Octal : " + on);
		while(true) {
			if(on == 0) {
				break;
			}
			else
			{
				int temp = on % 10;
				dnum += temp * Math.pow(8, p);
				on = on / 10;
				p++;
			}
		}
		System.out.println("Decimal no. : " + dnum);
		
	}

}

/*
***Conversion of Octal to Decimal***
Using Integer.parseInt()
Octal : 157
Decimal no. : 111
Without using predefined method
Octal : 143
Decimal no. : 99
*/
