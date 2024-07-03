package com.javaSortSetObjects;

import java.util.Comparator;

public class SortEmployeeByRole implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e2.getEmployeeRole().compareTo(e1.getEmployeeRole());
	}

}
