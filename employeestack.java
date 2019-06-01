package employeestack;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class employeestack {
	public static void main(String[] args) {
		//new object to store temporary employee details
		employee empinp = new employee("","");
		//empstk is the stack to hold all employee details from the file (Method 1)
		Stack<String> empstk = new Stack<String>();
		//emparr is an arrayList to hold all employee details from the file (Method 2)
		ArrayList<String> emparr = new ArrayList<String>();
		try {
			Scanner read = new Scanner(new FileReader("emp.txt"));
			while(read.hasNextLine()) {
				String line = read.nextLine();//read every line
				String[] split_arr = line.split(" ");//split line based on spaces
				empinp.setid(split_arr[0]);//store first space with ID
				empinp.setname(split_arr[1]);//store second space with name
				empstk.push(empinp.toString());//adding stored object to stack (Method 1)
				emparr.add(empinp.toString());// adding stored object to array list (Method 2) 
			}
		}
		catch (IOException e) {
			System.out.println("Error!! Trace :: " + e);
		}
		System.out.println("Top element of the stack is :: " + empstk.peek());//top of stack
		System.out.println("First pop :: " + empstk.pop()); // pop
		System.out.println("Second pop :: " + empstk.pop()); // pop
		System.out.println("Currently the top element in the stack is :: "+ empstk.peek()); // current top of stack
	}
}
