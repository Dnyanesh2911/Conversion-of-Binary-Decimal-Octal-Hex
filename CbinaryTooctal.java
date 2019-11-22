package conversionBDOH;

//Convert Binary to Octal
public class CbinaryTooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Binary to Octal***");
		
		//Using predefined methods
		System.out.println("Using predefined method");
		
		String bnum = "10101";
		int dnum = Integer.parseInt(bnum,2); // convert to decimal
		String ostr = Integer.toOctalString(dnum); //convert to octal
	
		//binary -> decimal -> octal
		System.out.println("Binary : " + bnum + "\nOctal no. : " + ostr);
		
	}

}

/*
***Conversion of Binary to Octal***
Using predefined method
Binary : 10101
Octal no. : 25
 */