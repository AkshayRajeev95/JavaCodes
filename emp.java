package employment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		employee emp1 = new employee("A00001","Akshay");       //creating multiple user data for comparison
		employee emp2 = new employee("A00002","Abhilash");
		employee emp3 = new employee("A00003","Mohan");
		employee emp4 = new employee("A00004","Kiran");
		employee emp5 = new employee("A00005","Tejas");
		employee emp6 = new employee("A00006","Raj");
		employee emp7 = new employee("A00007","Rahul");
		employee empinp = new employee("x","y");
		
		
		List<employee> employees = new ArrayList<employee>();  //creating a list of all employees
		employees.add(emp1);                                   //adding all employee obj ects to the list
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		
		
		System.out.println("Enter name of the employee");
		empinp.setname(input.next());        // enters input Employee Name 
		System.out.println("Enter ID of the employee");
		empinp.setid(input.next());          // enters input Employee ID
		System.out.println("Enter 1 to use Equals method, 2 for compareTo or 3 for compare method");
		int cases = input.nextInt();         // user has the choice to choose which function they want to use
		int i,j;
		j=0;
		
		switch(cases) {
		
		case 1:{
		
				for(i=0; i<7; i++) {        // loop to compare inputed employee with every other element in the list
					boolean TF = empinp.equals(employees.get(i)); // uses the equals method of the class employee
					if (TF == true) {       // prints "We have a match" if the searched employee is present in the list
						System.out.println("We have a match");
						j=1;
						break;
					}
				}break;
		}
		case 2:{
				for(i=0; i<7; i++) {       // loop to compare inputed employee with every other element in the list
					int TF = empinp.compareTo(employees.get(i)); // uses the compareTo method of the class employee
					if (TF == 0) {         // prints "We have a match" if the searched employee is present in the list
						System.out.println("We have a match");
						j=1;
						break;
					}
				}break;
		}
		case 3:{
				for(i=0; i<7; i++) {        // loop to compare inputed employee with every other element in the list
					int TF = empinp.compare(empinp,employees.get(i));// uses the compare method of the class Employee
					if (TF == 0) {          // prints "We have a match" if the searched employee is present in the list
						System.out.println("We have a match");
						j=1;
						break;
					}		
				}
			}break;
		}
		if (j==0) {       // Prints "We do not have a match" if there is a mismatch
			System.out.println("We do not have a match");
		}
		System.out.println("Here is the list of Employee names and IDs in the database :: ");
		for(i=0;i<7;i++) {
			System.out.println(employees.get(i)); // Prints out all the employees in the list
		}
	}

}
