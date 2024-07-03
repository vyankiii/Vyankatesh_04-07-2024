package com.javaSortSetWithComparatorObjects;

import java.util.Comparator;

public class SortEmployeeByRole implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e1.getEmployeeRole().compareTo(e2.getEmployeeRole());
	}

}
