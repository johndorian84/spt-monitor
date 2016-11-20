package it.spt.monitor.repository;

import it.spt.monitor.domain.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Spring Data JPA repository for the Employee entity.
 */
@SuppressWarnings("unused")
public abstract class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@PersistenceContext
    private EntityManager em;
	
	 @Autowired
	 EmployeeRepository employeeRepository;
	
	//@Query(value = "select new Employee(u.id ,u.employeeId ,u.firstName , u.lastName ,u.email ,u.phoneNumber  ,u.hireDate, u.salary ,u.commissionPct ) from Employee u ")
	public
	Page<Employee> findByParameters(Pageable pageable){
		//@Param("lastname")Long id,@Param("lastname") String lastName,
		return em.createQuery(
			    "select new Employee(u.id ,u.employeeId ,u.firstName , u.lastName ,u.email ,u.phoneNumber  ,u.hireDate, u.salary ,u.commissionPct ) from Employee u")
				.getResultList();
		
//	    .setParameter("custName", name)
//	    .setMaxResults(10)
	}

}
