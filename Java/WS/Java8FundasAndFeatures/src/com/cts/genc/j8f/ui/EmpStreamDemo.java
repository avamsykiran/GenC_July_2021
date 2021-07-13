package com.cts.genc.j8f.ui;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.cts.genc.j8f.model.Employee;

public class EmpStreamDemo {

	public static void main(String[] args) {
		
		Set<Employee> emps = new TreeSet<>();
		
		emps.add(new Employee(110L,"Zenat",LocalDate.now(),34500.0,
				new TreeSet<>(Arrays.asList("Java","SQL","Angular"))));
		emps.add(new Employee(104L,"Anirudh",LocalDate.now().plusDays(10),34500.0,
				new TreeSet<>(Arrays.asList("Java","SQL","ReactJS"))));
		emps.add(new Employee(115L,"Bhargav",LocalDate.now().plusDays(9),32500.0,
				new TreeSet<>(Arrays.asList("Java","SQL","Angular"))));
		emps.add(new Employee(109L,"Lenin",LocalDate.now().plusDays(2),14500.0,
				new TreeSet<>(Arrays.asList("Java","Angular"))));
		emps.add(new Employee(114L,"Manish",LocalDate.now().plusDays(7),24500.0,
				new TreeSet<>(Arrays.asList("Java","SQL","ReactJS"))));
		emps.add(new Employee(102L,"Goerge",LocalDate.now().plusDays(5),34590.0,
				new TreeSet<>(Arrays.asList("Java","Angular"))));
		emps.add(new Employee(111L,"Charles",LocalDate.now().plusDays(100),31590.0,
				new TreeSet<>(Arrays.asList("Java","ReactJS"))));
		emps.add(new Employee(101L,"Darwin",LocalDate.now().plusDays(71),134500.0,
				new TreeSet<>(Arrays.asList("Java","ReactJS"))));
		
		/*for(Employee e : emps)
			e.setBasic(e.getBasic()*2);*/
		
		emps.stream().forEach(e -> e.setBasic(e.getBasic()*2));
		emps.stream().forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		Optional<Employee> result = emps.stream()
				.reduce((e1,e2) -> e1.getDateofJoining().isBefore(e2.getDateofJoining())?e1:e2);
		
		if(result.isPresent())
			System.out.println(result.get());
		
		System.out.println("-----------------------------------------------------");
		List<Employee> empList = emps.stream().collect(Collectors.toList());
		System.out.println(empList);
		
		System.out.println("-----------------------------------------------------");
		Map<Long,String> empMap = emps.stream()
					.collect(Collectors.toMap(Employee::getEmpId, Employee::getFullName));
		System.out.println(empMap);
		
		System.out.println("-----------------------------------------------------");
		/*
		 * List<Employee> empList2= emps.stream() .filter(e -> e.getBasic()<=60000)
		 * .collect(Collectors.toList()); System.out.println(empList2);
		 */
		emps.stream() .filter(e -> e.getBasic()<=60000).forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		//emps.stream().map(e -> e.getFullName()).forEach(System.out::println);
		Set<String> allNames = emps.stream().map(e -> e.getFullName()).collect(Collectors.toSet());
		System.out.println(allNames);
		System.out.println("-----------------------------------------------------");
		emps.stream().map(e -> e.getSkills()).forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		emps.stream().flatMap(e -> e.getSkills().stream()).forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		emps.stream().flatMap(e -> e.getSkills().stream()).distinct().forEach(System.out::println);
	}

}
