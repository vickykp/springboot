package mobiloitte.com.postman.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mobiloitte.com.postman.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
