package com.javaSortSetObjects;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e2.getEmployeeName().compareTo(e1.getEmployeeName());
	}

}
