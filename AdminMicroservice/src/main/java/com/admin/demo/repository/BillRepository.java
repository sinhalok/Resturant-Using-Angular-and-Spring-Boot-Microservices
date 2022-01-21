package com.admin.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.admin.demo.model.Bill;



@Repository
public interface BillRepository extends CrudRepository<Bill, Integer> {

	public List<Bill> findByTime(LocalDate date);
//	public List<Bill> findByTime(LocalDate start,LocalDate end);
	
	public List<Bill> findByUserId(int userId);
}
