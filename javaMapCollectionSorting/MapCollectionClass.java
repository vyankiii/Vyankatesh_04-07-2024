package com.javaMapCollectionSorting;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionClass {

	public static void main(String[] args) {

		// key, value
		Map<Employee, Department> mapData = new HashMap<Employee, Department>();

		mapData.put(new Employee(201, "Manoj", "SD", 56254.56), new Department(1440, "Development"));
		mapData.put(new Employee(204, "Vijay", "JD", 34544.4), new Department(4235, "QA"));
		mapData.put(new Employee(203, "Mahesh", "SE", 44654.89), new Department(2211, "BA"));
		mapData.put(new Employee(206, "Kiran", "PHPD", 24654.89), new Department(233, "HR"));
		mapData.put(new Employee(205, "Shree", "PD", 34654.89), new Department(3342, "Admin"));

		for (Map.Entry<Employee, Department> data : mapData.entrySet()) {
			System.out.println(data.getKey() + " --->>> " + data.getValue());
		}

	}

}
