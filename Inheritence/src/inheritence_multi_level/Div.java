package inheritence_multi_level;

import org.testng.annotations.Test;

public class Div extends Mul {
@Test
void Divs(){
	float div;
	div=a/b;
	System.out.println("division of a & b are:" +div);
}
}
