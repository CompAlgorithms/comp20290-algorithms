import java.io.*;

public class RussianMultiplication {
		
		public static void main (String args[]) {
			
			int a = 68; //1
			int b = 139; //1
			int res = 0; //1
			
			while (b != 0 ) { 
				if (b % 2 != 0) {
					res += a; 
					
				}
				a = a * 2; 
				b = b/2; 
				
				System.out.println(res);  
//				System.out.println(System.currentTimeMillis()); 
			}
		}
		

	}
 
// class RussianMultiplication
// {
//  public static void main(String[] args)
//  {
//   //get the input numbers
//   Console con=System.console();
//   System.out.print("Enter the first number: ");
//   int num1=Integer.parseInt(con.readLine());
  
//   System.out.print("Enter the second number: ");
//   int num2=Integer.parseInt(con.readLine());
//   int product=0;
  
//   if(num1%2!=0)
//    product=product+num2;
//   System.out.println("Multiplicand Multiplier Product");
//   System.out.println("\t"+num1+"\t"+num2+"\t"+product);
//   while(num1!=1)
//   {
//    num1=num1/2;
//    num2=num2*2;
//    if(num1%2!=0)
//     product=product+num2;
//    System.out.println("\t"+num1+"\t"+num2+"\t"+product);
//   }
  
//   System.out.println("The product is: "+product);
//  }
// }



