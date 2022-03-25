package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		List<Employee> emps = new ArrayList<Employee>();
		
		System.out.println("Enter the number of employees");
		int n = scn.nextInt();
		for(int i=1;i <= n;i++) {
			System.out.print("Employe #"+i+": data:");
			System.out.print("OutSourced (y/n)? ");
			char ch = scn.next().charAt(0);
			System.out.print("Name:");
			scn.nextLine();
			String name = scn.nextLine();
			System.out.print("Hours:");
			int hours = scn.nextInt();
			System.out.print("Value per hour:");
			double valuePerHour = scn.nextDouble();
			if(ch == 'y'){
				System.out.print("AdicionalCharge:");
				double adicionalCharge = scn.nextDouble();
				Employee emplo = new OutSourcedEmployee(name,hours,valuePerHour,adicionalCharge);
				emps.add(emplo);
			}else {
				Employee employ = new Employee(name,hours,valuePerHour);
				emps.add(employ);
			}
		}
		System.out.println();
		System.out.println("Payments:");
		for(Employee emp:emps){
			System.out.println(emp.getName() +" - $" + String.format("%.2f",emp.payment()));
		}
		scn.close();
	}

}
