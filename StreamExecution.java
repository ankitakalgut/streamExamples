package com.demo.streamexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExecution {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(new Employee(1, 25, 436677.0, "Cloud", "Ankita"),
				new Employee(2, 29, 3938739.0, "Cloud", "Seema"), new Employee(3, 30, 9867899.0, "DCX", "Sarah"),
				new Employee(4, 29, 747294.0, "Cloud", "Nemo"));

		// Get the employee which has department ="Cloud" and second highest salary
		Optional<Employee> departCloudEmpList = empList.stream()
				.filter(s -> s.getDepartment().equalsIgnoreCase("cloud"))
				.sorted(Comparator.comparing(Employee::getAge).reversed()).skip(1).findFirst();

		System.out.println(departCloudEmpList.isPresent() ? departCloudEmpList.get() : "Not found");

		empList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(s -> System.out.println(s));

	}

}
