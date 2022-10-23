package ArraySorting;
 
import java.util.*;

class Employee{
	int salary;
	String name;
	
	Employee(int salary, String name){
		this.salary = salary;
		this.name = name;
	}
}

// this also can be sort by implementing the comparator are comparable Interface :
		// we can implement comparator here :

public class sortName{
	public static void main(String args[]) {
		
		// Initially we are creating an Employee array :
		Employee emp[] = {	new Employee(87000,"Arun"),
							new Employee(92000,"Singh"),
							new Employee(76000, "Jake"),
							new Employee(86000, "Penelope"),
							new Employee(70000, "Martha")
						 };
		
// Q1. Arrange employees based on decreasing oreder of their salary :
		
		Arrays.sort(emp,(x,y) -> {
			// sorts salary in decreasing order :
			return y.salary - x.salary;
		});
		
		
		// in this for each loop we can use the Employee keyword or the var keyword :
		System.out.println("Sorting based on salary in decreasing order :");
		for(Employee k : emp) {
			 
			System.out.println(k.salary+":"+k.name);
		}
		
		
// Q2. Arrange Employees based on their names length in decreasing order :
		 
		Arrays.sort(emp, (ob1, ob2) -> {
			// sorts names in decreasing order :
				return ob2.name.length() - ob1.name.length();
		});
		
		System.out.println();
		System.out.println("Sorting based on names length in decreasing order :");
		for(Employee z : emp ) {
			System.out.println(z.salary+":"+z.name);
		}
		
	}
}