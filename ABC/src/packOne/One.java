package packOne;

import packHelloA.IAMOK;

public class One {
	
	public void xyz() {
		IAMOK obj=new IAMOK();
		obj.isItOk();
	System.out.println("my name is :"+obj.myName);
	}
	
	public static void main(String[] args) {
		One obj=new One();
		obj.xyz();
	}

}
