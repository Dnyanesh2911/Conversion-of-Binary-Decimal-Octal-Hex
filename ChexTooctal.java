package conversionBDOH;

//Convert Hexadecimal to Octal
public class ChexTooctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Hexadecimal to Octal***");
		
		//Using predefined method
		System.out.println("Using predefined method"); 
				   
	    String hexadecimal = "ABD";
	    
	    int decimal = Integer.parseInt(hexadecimal, 16); // convert decimal
	    String octal = Integer.toOctalString(decimal); // convert octal
	    
	    //hex -> decimal -> octal
	    System.out.println("Hexadecimal : " + hexadecimal + "\nOctal : " + octal);
	    
	    
	    //Without using predefined method : hex -> decimal -> octal
	    System.out.println("Without using predefined method");
	    
	    String hexnum = "ACD";
        int i=1, j;
        int octnum[] = new int[100];
          
        
        // first convert hexadecimal to decimal
        String hstr = "0123456789ABCDEF";
        hexnum = hexnum.toUpperCase();
		int dnum = 0;
				
		for(int k = 0; k < hexnum.length(); k++) {
			char ch = hexnum.charAt(k);
			int n = hstr.indexOf(ch);
			dnum = 16 * dnum + n;
		}
		System.out.println("Hexadecimal : " + hexnum);
        
        // now convert decimal to octal
        
        while(dnum != 0)
        {
            octnum[i++] = dnum%8;
            dnum = dnum/8;
        }
		
        System.out.print("Octal : ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
	
	}

}

/*
***Conversion of Hexadecimal to Octal***
Using predefined method
Hexadecimal : ABD
Octal : 5275
Without using predefined method
Hexadecimal : ACD
Octal : 5315
*/
