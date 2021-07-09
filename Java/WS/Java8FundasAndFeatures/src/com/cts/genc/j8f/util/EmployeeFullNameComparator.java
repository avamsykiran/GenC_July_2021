package com.cts.genc.j8f.util;

import java.util.Comparator;

import com.cts.genc.j8f.model.Employee;

public class EmployeeFullNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFullName().compareTo(o2.getFullName());
	}

}
