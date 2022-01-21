package com.user.demo.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.demo.model.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Integer> {
	public List<Bill> findByUserId(int userId);

}
