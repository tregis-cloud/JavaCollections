package com.simplilearn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeColloection {

	public static void main(String[] args) {
		
		var employee_1 = new Employee(100, "John Smith", "Engineering");
		var employee_2 = new Employee(101, "Will Smith", "Development");
		var employee_3 = new Employee(102, "Mike Smith", "Operations");
		var employee_4 = new Employee(103, "Mary Smith", "QA");
		var employee_5 = new Employee(104, "Harry Smith", "QA");
		
		//A list collection is an ordered collection also known as a sequence
		//The user of this interface has precise control over where in the list
		//each element is inserted. The user can access elements by their integer 
		//index (position in the list) and search for elements in the list. 
		List <Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee_1);
		employeeList.add(employee_2);
		employeeList.add(employee_3);
		employeeList.add(employee_4);
		employeeList.add(employee_5);
		
		System.out.println("The Employee Details");
		System.out.println("------------------------");
		
		for (Employee employee: employeeList) {
			System.out.println("The Employee Id  : " + employee.getEmpID());
			System.out.println("The Employee Name: " + employee.getEmpName());
			System.out.println("The Employee Dept: " + employee.getEmpDept());
			
		}
		
		var player_1 = new Players("Dennis Rodmon", "Power Forward");
		var player_2 = new Players("Michael Jordon", "Shooting Guard");
		var player_3 = new Players("Scottie Pippen", "Small Forward");
		var player_4 = new Players("Lebron James", "Point Guard");
		var player_5 = new Players ("Kobe Bryan", "Center");
		
		List <Players> playersList = new ArrayList<Players>();
		playersList.add(player_1);
		playersList.add(player_2);
		playersList.add(player_3);
		playersList.add(player_4);
		playersList.add(player_5);
        
		System.out.println();
		System.out.println("The Players");
		System.out.println("------------------------");
		
		for (Players player: playersList) {
			System.out.println("Player's Name: " + player.getPlayerName());
			System.out.println("Player's Position: " + player.getPlayerPosition());
	
		}
				
		var number_1 = new Numbers(1_000_000);
		var number_2 = new Numbers(2_000_000);
		var number_3 = new Numbers(3_000_000);
		var number_4 = new Numbers(4_000_000);
		var number_5 = new Numbers(5_000_000);
		
		List <Numbers> numbersList = new ArrayList<Numbers>();
		numbersList.add(number_1);
		numbersList.add(number_2);
		numbersList.add(number_3);
		numbersList.add(number_4);
		numbersList.add(number_5);
		
		System.out.println();
		System.out.println("The Numbers");
		System.out.println("------------------------");
		
		for (Numbers number : numbersList) {
			System.out.println( number.getNumbersList());
		}
		
			
	}

}
