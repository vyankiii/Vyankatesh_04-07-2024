package com.javaSortSetObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeSortArrayListWithComparable {

	public static void main(String[] args) {

		Set<Employee> values = new HashSet<Employee>();// set collections

		values.add(new Employee(112, "Satish", "PHP Developer", 90876.45));
		values.add(new Employee(115, "Harish", "C#.Net Developer", 78656.47));
		values.add(new Employee(556, "Dinesh", "Java Developer", 77876.45));
		values.add(new Employee(113, "Ganesh", "C#.Net Developer", 98656.47));
		values.add(new Employee(213, "Kamal", "PHP Developer", 66876.45));
		values.add(new Employee(456, "Ram", "C#.Net Developer", 48656.66));

		List<Employee> listValues = new ArrayList<Employee>(values);

		Collections.sort(listValues);

		for (Employee employee : listValues) {
			System.out.println(employee);
		}

	}

}
