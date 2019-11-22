package conversionBDOH;

//Convert Binary to Hexadecimal
public class CbinaryTohex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Binary to Hexadecimal***");
		
		//Using predefined methods
		System.out.println("Using predefined method");
		
		String bnum = "10101";
	
		int dnum = Integer.parseInt(bnum,2); // convert to decimal
		String hstr = Integer.toHexString(dnum); // convert to hex
		
		//binary -> decimal -> hex
		System.out.println("Binary : " + bnum + "\nHexadecimal no. : " + hstr);
	}

}

/*
***Conversion of Binary to Hexadecimal***
Using predefined method
Binary : 10101
Hexadecimal no. : 15
 */