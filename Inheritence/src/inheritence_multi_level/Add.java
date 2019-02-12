package inheritence_multi_level;

import java.util.Scanner;

import org.testng.annotations.BeforeTest;
public class Add {
	int a,b,sum;
	
	@BeforeTest
void add(){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter First Number: ");
    a = s.nextInt();
    
    System.out.println("Enter Second Number: ");
    b = s.nextInt();
    
    s.close();
    sum= a+b;
   
    System.out.println("addition of a & b are:" +sum);
}
}
