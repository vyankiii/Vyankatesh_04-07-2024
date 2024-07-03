package com.javaSortSetWithComparatorObjects;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.getEmployeeSalary() == e2.getEmployeeSalary()) {
			return 0;
		} else if (e1.getEmployeeSalary() > e2.getEmployeeSalary()) {
			return 1;
		} else
			return -1;
	}

}
