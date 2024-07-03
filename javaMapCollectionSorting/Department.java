package com.javaMapCollectionSorting;

public class Department {
	private int departementId;
	private String departementName;

	public Department() {
		
	}

	public Department(int departementId, String departementName) {
		super();
		this.departementId = departementId;
		this.departementName = departementName;
	}

	public int getDepartementId() {
		return departementId;
	}

	public void setDepartementId(int departementId) {
		this.departementId = departementId;
	}

	public String getDepartementName() {
		return departementName;
	}

	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}

	@Override
	public String toString() {
		return "Department [departementId=" + departementId + ", departementName=" + departementName + "]";
	}

}
