package impl;

import java.util.List;

import pojo.Employee;

public interface EmployeeDao {
		boolean addEmployee(Employee emp);
		boolean deleteEmployee(int empId);
		boolean updateEmployee(Employee emp);
		Employee getEmployeeById(int empId);
		List<Employee> getAllEmployees();
}