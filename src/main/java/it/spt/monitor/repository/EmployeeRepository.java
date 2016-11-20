package it.spt.monitor.repository;

import it.spt.monitor.domain.Employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the Employee entity.
 */
@SuppressWarnings("unused")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
	//@Query(value = "select new Employee(u.id ,u.employeeId ,u.firstName , u.lastName ,u.email ,u.phoneNumber  ,u.hireDate, u.salary ,u.commissionPct ) from Employee u ")
	Page<Employee> findByParameters(Pageable pagable);
	//@Param("lastname")Long id,@Param("lastname") String lastName,


}
