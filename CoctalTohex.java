package conversionBDOH;

//Convert Octal to Hexadecimal
public class CoctalTohex {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		System.out.println("***Conversion of Octal to Hexadecimal***");
		
		//Using predefined method
		System.out.println("Using predefined method");
		
		String octnum = "123";
		
        int decnum = Integer.parseInt(octnum, 8); //convert decimal
        String hexnum = Integer.toHexString(decnum); // convert hex
		
        //octal -> decimal -> hex
        System.out.println("Octal : " + octnum + "\nHexadecimal : " + hexnum);
        
        
        
        //Without using predefined method : octal -> decimal -> hex
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
      	      	
      	char a[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
      	int rem;
      	String hexdec = "";
      	
      	while(dnum != 0)
      	   {
      		rem = dnum % 16;
      		hexdec = a[rem] + hexdec;
      		dnum = dnum / 16;
      	   }
      	System.out.println("Hexadecimal : " + hexdec);
	}
}

/*
***Conversion of Octal to Hexadecimal***
Using predefined method
Octal : 123
Hexadecimal : 53
Without using predefined method
Octal : 143
Hexadecimal : 63

*/