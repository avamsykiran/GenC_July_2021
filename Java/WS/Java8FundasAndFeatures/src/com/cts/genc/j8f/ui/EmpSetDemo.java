package com.cts.genc.j8f.ui;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.cts.genc.j8f.model.Employee;
import com.cts.genc.j8f.util.EmployeeFullNameComparator;

public class EmpSetDemo {

	public static void main(String[] args) {
		
		//Set<Employee> emps = new TreeSet<>();
		//Set<Employee> emps = new TreeSet<>(new EmployeeFullNameComparator());
		//Set<Employee> emps = new TreeSet<>(new EmployeeDOJComparator());
		Set<Employee> emps = new TreeSet<>(new EmployeeFullNameComparator().reversed());
		
		emps.add(new Employee(110L,"Zenat",LocalDate.now(),34500.0));
		emps.add(new Employee(104L,"Anirudh",LocalDate.now().plusDays(10),34500.0));
		emps.add(new Employee(115L,"Bhargav",LocalDate.now().plusDays(9),32500.0));
		emps.add(new Employee(109L,"Lenin",LocalDate.now().plusDays(2),14500.0));
		emps.add(new Employee(114L,"Manish",LocalDate.now().plusDays(7),24500.0));
		emps.add(new Employee(102L,"Goerge",LocalDate.now().plusDays(5),34590.0));
		emps.add(new Employee(111L,"Charles",LocalDate.now().plusDays(100),31590.0));
		emps.add(new Employee(101L,"Darwin",LocalDate.now().plusDays(71),134500.0));
		
		for(Employee emp : emps)
			System.out.println(emp);

	}

}
