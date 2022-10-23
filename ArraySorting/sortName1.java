package ArraySorting;

import java.util.*;

class EmployeeZ {
	int salary;
	String name;

	EmployeeZ(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
}

// this also can be sort by implementing the comparator are comparable Interface :
// we can implement comparator here :

public class sortName1 {
	public static void main(String args[]) {
		
	   // Initially we are creating an Employee array :
		EmployeeZ arr[] = {	new EmployeeZ(87000,"Arun"),
							new EmployeeZ(92000,"Singh"),
							new EmployeeZ(76000, "Singh"),
							new EmployeeZ(86000, "Penelope"),
							new EmployeeZ(70000, "Martha"),
							new EmployeeZ(85500, "Singh"),
							new EmployeeZ(65000, "Martha"),
							new EmployeeZ(92000, "Blake")
						   };
				
// Q1. if the Employees names are same, Arrange the them based on their salary in Decreasing order :
		
		Arrays.sort(arr,(ob1,ob2) -> {
				// using equals method : checking if names are same
				if(ob2.name.equals(ob1.name) == true) {
					// sorting in decreasing order :
					return ob1.salary - ob2.salary; 	 
				}
				return 0;		
			});
				
				
		// using for each loop just printing the sorted array keeping rest as it is :
		for(EmployeeZ z : arr) {
			System.out.println(z.salary+":"+z.name);
		}
	}
}
