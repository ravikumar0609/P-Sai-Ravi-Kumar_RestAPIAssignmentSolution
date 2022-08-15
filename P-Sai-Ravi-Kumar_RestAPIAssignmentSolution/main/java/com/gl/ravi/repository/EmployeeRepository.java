package com.gl.ravi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.ravi.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeEntity,Integer> {
	List<EmployeeEntity> findByFirstNameContainsAllIgnoreCase(String firstName);
	List<EmployeeEntity> findAllByOrderByFirstNameAsc();
	List<EmployeeEntity> findAllByOrderByFirstNameDesc();

	
}
