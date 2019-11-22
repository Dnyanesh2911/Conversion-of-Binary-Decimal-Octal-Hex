package conversionBDOH;

//Convert Octal to Binary
public class CoctalTobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Octal to Binary***");
		
		//Using predefined methods
		System.out.println("Using predefined methods");
		
		String octal = "67";	   		
		int decimal = Integer.parseInt(octal, 8); //convert decimal
		String binary = Integer.toBinaryString(decimal);// convert binary
		
		//octal -> decimal -> binary
		System.out.println("Octal : " + octal + "\nBinary : " + binary );
		
		// Without using predefined method
		System.out.println("Without using predefined method");
				
		int onum = 77;
		int dnum = 0, i = 0;
        long bnum = 0;
        
        System.out.println("Octal : " + onum);
        
        while(onum != 0)
        {
        	dnum += (onum % 10) * Math.pow(8, i);
            ++i;
            onum/=10;
        }
        i = 1;
        while (dnum != 0)
        {
        	bnum += (dnum % 2) * i;
            dnum /= 2;
            i *= 10;
        }
        System.out.println("Binary : " + bnum);
        
        //Using Switch case
        System.out.println("Using Switch case");
        
        String octnum = "345";
        String b = "";
        long j = 0; 
       
        System.out.print("Octal : " + octnum + "\nBinary : ");
        
        while (j < octnum.length()) { 
              
            char c = octnum.charAt((int)j); 
            switch (c) { 
            case '0': 
                b += "000"; 
                break; 
            case '1': 
                b += "001"; 
                break; 
            case '2': 
                b += "010"; 
                break; 
            case '3': 
                b += "011"; 
                break; 
            case '4': 
                b += "100"; 
                break; 
            case '5': 
                b += "101"; 
                break; 
            case '6': 
                b += "110"; 
                break; 
            case '7': 
                b += "111"; 
                break; 
            default: 
                System.out.println( "\nInvalid Octal no : " + octnum.charAt((int)j)); 
                break; 
            } 
            j++; 
        }System.out.println(b); 
	}
}

/*
***Conversion of Octal to Binary***
Using predefined methods
Octal : 67
Binary : 110111
Without using predefined method
Octal : 77
Binary : 111111
Using Switch case
Octal : 345
Binary : 011100101
*/
