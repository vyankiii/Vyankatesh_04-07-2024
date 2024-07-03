package com.javaSortSetObjects;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.getEmployeeId() == e2.getEmployeeId()) {
			return 0;
		} else if (e1.getEmployeeId() < e2.getEmployeeId()) {
			return 1;
		} else
			return -1;
	}

}
