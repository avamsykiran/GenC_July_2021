package com.cts.genc.j8f.util;

import java.util.Comparator;

import com.cts.genc.j8f.model.Employee;

public class EmployeeDOJComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDateofJoining().compareTo(o2.getDateofJoining());
	}

}
