package conversionBDOH;

//Convert Hexadecimal to Binary
public class ChexTobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Conversion of Hexadecimal to Binary***");
		
		//Using predefined methods
		System.out.println("Using predefined methods");
				
		String hex = "A";	   
	    int decimal = Integer.parseInt(hex, 16);
		String binary = Integer.toBinaryString(decimal);

		//hex -> decimal -> binary
		System.out.println("Hexadecimal : " + hex + "\nBinary : " + binary );
		
		//Using Switch case and exception
		System.out.println("Using Switch case");
		
		String hnum = "1AC5" ; 
                
        try{
        	char hexd[] = new char[100] ; 
            hexd = hnum.toCharArray() ;
           	int i = 0;
           	
           	System.out.print("Hexadecimal : " + hnum + "\nBinary : ");
           	while (hexd[i] != '\u0000') { 
               switch (hexd[i]) { 
                    case '0': 
                        System.out.print("0000"); 
                        break; 
                    case '1': 
                        System.out.print("0001"); 
                        break; 
                    case '2': 
                        System.out.print("0010"); 
                        break; 
                    case '3': 
                        System.out.print("0011"); 
                        break; 
                    case '4': 
                        System.out.print("0100"); 
                        break; 
                    case '5': 
                        System.out.print("0101"); 
                        break; 
                    case '6': 
                        System.out.print("0110"); 
                        break; 
                    case '7': 
                        System.out.print("0111"); 
                        break; 
                    case '8': 
                        System.out.print("1000"); 
                        break; 
                    case '9': 
                        System.out.print("1001"); 
                        break; 
                    case 'A': 
                    case 'a': 
                        System.out.print("1010"); 
                        break; 
                    case 'B': 
                    case 'b': 
                        System.out.print("1011"); 
                        break; 
                    case 'C': 
                    case 'c': 
                        System.out.print("1100"); 
                        break; 
                    case 'D': 
                    case 'd': 
                        System.out.print("1101"); 
                        break; 
                    case 'E': 
                    case 'e': 
                        System.out.print("1110"); 
                        break; 
                    case 'F': 
                    case 'f': 
                        System.out.print("1111"); 
                        break; 
                    default: 
                        System.out.print("\nInvalid hexadecimal no : " + hexd[i]); 
                    } 
                    i++; 
                }
           	System.out.println(hexd);
            } 
            catch (ArrayIndexOutOfBoundsException e){ 
                System.out.print(""); 
            }
	}
}

/*
***Conversion of Hexadecimal to Binary***
Using predefined methods
Hexadecimal : A
Binary : 1010
Using Switch case
Hexadecimal : 1AC5
Binary : 0001101011000101
*/