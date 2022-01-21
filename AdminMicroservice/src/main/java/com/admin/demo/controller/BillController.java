package com.admin.demo.controller;

import java.time.LocalDate;
import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.admin.demo.model.Bill;
import com.admin.demo.model.Messages;
import com.admin.demo.model.ResponsePage;
import com.admin.demo.repository.BillRepository;

@RestController
@CrossOrigin
public class BillController {
  @Autowired
  private BillRepository billRepository;
  
 
  
  @GetMapping("/allTodayBill")
  public ResponseEntity<List<Bill>> getAllBills(){
	  LocalDate lt = LocalDate.now();
	  List<Bill> bill = (List<Bill>) this.billRepository.findByTime(lt);
	  return new ResponseEntity<List<Bill>>(bill, HttpStatus.OK);
  }
  
//  @GetMapping("/allMonthBill")
//  public ResponseEntity<List<Bill>> getMonthBills(){
//	  LocalDate start = LocalDate.ofEpochDay(System.currentTimeMillis() / (24 * 60 * 60 * 1000) ).withDayOfMonth(1);
//
//	  LocalDate end = LocalDate.ofEpochDay(System.currentTimeMillis() / (24 * 60 * 60 * 1000) ).plusMonths(1).withDayOfMonth(1).minusDays(1);
//	  List<Bill> bill = (List<Bill>) this.billRepository.findByTime(start,end);
//	  return new ResponseEntity<List<Bill>>(bill, HttpStatus.OK);
//  }
  
//  
//	@DeleteMapping("/deleteUser/{id}")
//	public ResponseEntity<?> deleteUser(@PathVariable int id){
//		if(this.userService.deleteUser(id)) {
//			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS, "You have successfuly deleted user!"));
//		}else {
//			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE, "You can not delete user!"));
//		}
//	}
	
  	@GetMapping("/getBillByUserId/{id}")
  	public int getAllBillUser(@PathVariable int id){
  		 List<Bill> bills = (List<Bill>) this.billRepository.findByUserId(id);
  		 int sum=0;
  		for(Bill bill : bills) {
  			sum+=bill.getItem().getPrice()*bill.getItem().getQty();
 		
  		}
  		System.out.println(sum);
  		 
  		return sum;
  		 
  			
  		}
  		
  		
  	
  
  
  
  
}
