package inheritence_multi_level;

import org.testng.annotations.BeforeClass;

public class Mul extends Sub {
	
	@BeforeClass
void mul(){
	int mul;
	mul=a*b;
	System.out.println("multiplication of a & b are:" +mul);
}
}
