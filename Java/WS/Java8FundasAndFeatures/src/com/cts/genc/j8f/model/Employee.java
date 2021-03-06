package com.cts.genc.j8f.model;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {

	private Long empId;
	private String fullName;
	private LocalDate dateofJoining;
	private Double basic;
	private Set<String> skills;

	public Employee() {
	}

	public Employee(Long empId, String fullName, LocalDate dateofJoining, Double basic) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.dateofJoining = dateofJoining;
		this.basic = basic;
		this.skills=new TreeSet<>();
	}
	
	public Employee(Long empId, String fullName, LocalDate dateofJoining, Double basic,Set<String> skills) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.dateofJoining = dateofJoining;
		this.basic = basic;
		this.skills=skills;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateofJoining() {
		return dateofJoining;
	}

	public void setDateofJoining(LocalDate dateofJoining) {
		this.dateofJoining = dateofJoining;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	
	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId.compareTo(o.empId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((basic == null) ? 0 : basic.hashCode());
		result = prime * result + ((dateofJoining == null) ? 0 : dateofJoining.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (basic == null) {
			if (other.basic != null)
				return false;
		} else if (!basic.equals(other.basic))
			return false;
		if (dateofJoining == null) {
			if (other.dateofJoining != null)
				return false;
		} else if (!dateofJoining.equals(other.dateofJoining))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", dateofJoining=" + dateofJoining + ", basic="
				+ basic + ", skills=" + skills + "]";
	}

	

}
