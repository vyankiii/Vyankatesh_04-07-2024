package com.javaSortSetWithComparatorObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeSetClass {

	public static void main(String[] args) {

		Set<Employee> values = new HashSet<Employee>();

		values.add(new Employee(112, "Satish", "PHP Developer", 90876.45));
		values.add(new Employee(115, "Harish", "C#.Net Developer", 78656.47));
		values.add(new Employee(556, "Dinesh", "Java Developer", 77876.45));
		values.add(new Employee(113, "Ganesh", "C#.Net Developer", 98656.47));
		values.add(new Employee(213, "Kamal", "PHP Developer", 66876.45));
		values.add(new Employee(456, "Ram", "C#.Net Developer", 48656.66));

		List<Employee> Listvalues = new ArrayList<Employee>(values);

		System.out.println("----------------sorted employee by id---------------");

		Collections.sort(Listvalues, new SortEmployeeById());

		for (Employee employee : Listvalues) {
			System.out.println(employee);
		}

		System.out.println("----------------sorted employee by name---------------");

		Collections.sort(Listvalues, new SortEmployeeByName());

		for (Employee employee : Listvalues) {
			System.out.println(employee);
		}

		System.out.println("----------------sorted employee by role---------------");

		Collections.sort(Listvalues, new SortEmployeeByRole());

		for (Employee employee : Listvalues) {
			System.out.println(employee);
		}

		System.out.println("----------------sorted employee by salary---------------");

		Collections.sort(Listvalues, new SortEmployeeBySalary());

		for (Employee employee : Listvalues) {
			System.out.println(employee);
		}

	}

}
