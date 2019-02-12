package inheritence_multi_level;

import org.testng.annotations.BeforeTest;

public class Sub extends Add{
	@BeforeTest
void sub(){
	int sub;
	 sub= a-b;
	System.out.println("substraction of a & b are:" +sub);
}
}
