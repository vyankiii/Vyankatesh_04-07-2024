package com.javaSortSetObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeListClass {

	public static void main(String[] args) {

		List<Employee> values = new ArrayList<Employee>();

		values.add(new Employee(112, "Satish", "PHP Developer", 90876.45));
		values.add(new Employee(115, "Harish", "C#.Net Developer", 78656.47));
		values.add(new Employee(556, "Dinesh", "Java Developer", 77876.45));
		values.add(new Employee(113, "Ganesh", "C#.Net Developer", 98656.47));
		values.add(new Employee(213, "Kamal", "PHP Developer", 66876.45));
		values.add(new Employee(456, "Ram", "C#.Net Developer", 48656.66));

		System.out.println("----------------sorted employee by id---------------");

		Collections.sort(values, new SortEmployeeById());

		for (Employee employee : values) {
			System.out.println(employee);
		}

		System.out.println("----------------sorted employee by name---------------");

		Collections.sort(values, new SortEmployeeByName());

		for (Employee employee : values) {
			System.out.println(employee);
		}

		System.out.println("----------------sorted employee by role---------------");

		Collections.sort(values, new SortEmployeeByRole());

		for (Employee employee : values) {
			System.out.println(employee);
		}

		System.out.println("----------------sorted employee by salary---------------");

		Collections.sort(values, new SortEmployeeBySalary());

		for (Employee employee : values) {
			System.out.println(employee);
		}

	}

}
