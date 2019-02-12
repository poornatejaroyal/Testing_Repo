package inheritence_single_level;

public class Employee1 extends Employee{
int bonus=10000;
public static void main(String args[]){
	Employee1 E=new Employee1();
	System.out.println("Total Salary:"+( E.salary+E.bonus));
}
}
