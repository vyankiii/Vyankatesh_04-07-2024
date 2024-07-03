package com.javaMapCollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCollectionClass2
{

	public static void main(String[] args)
	{

		//  key,  value
		Map<Employee, Department> mapData = new HashMap<Employee, Department>();

		mapData.put(new Employee(1, "Ganesh", "Software Developer", 72254.89), new Department(2200, "Development"));
		mapData.put(new Employee(4, "Ajay", "Java Developer", 58654.89), new Department(4455, "QA"));
		mapData.put(new Employee(8, "Mayur", "Software Engineer", 78654.89), new Department(2211, "BA"));
		mapData.put(new Employee(3, "Karthik", "PHP Developer", 23654.89), new Department(1133, "HR"));
		mapData.put(new Employee(2, "Dinesh", "Python Developer", 89654.89), new Department(3322, "Admin"));

		for(Map.Entry<Employee, Department> data: mapData.entrySet())
		{
			System.out.println(data.getKey()+" => "+data.getValue());
		}

		System.out.println("------------------------------------------------");


		// Extracting entries to a list and sorting by employee age
		List<Map.Entry<Employee, Department>> entryList = new ArrayList<>(mapData.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<Employee, Department>>()
		{
			@Override
			public int compare(Map.Entry<Employee, Department> e1, Map.Entry<Employee, Department> e2)
			{
				return e1.getKey().getEmployeeName().compareTo(e2.getKey().getEmployeeName());
			}
		});

		for (Map.Entry<Employee, Department> entry : entryList) 
		{
			System.out.println(entry.getKey().getEmployeeId() + " - " + entry.getKey().getEmployeeName());
		}
	}

}


