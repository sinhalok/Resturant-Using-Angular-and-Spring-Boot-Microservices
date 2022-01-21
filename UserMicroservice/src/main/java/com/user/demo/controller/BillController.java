package com.user.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.demo.model.Bill;
import com.user.demo.model.Messages;
import com.user.demo.model.ResponsePage;
import com.user.demo.model.repository.BillRepository;
import com.user.demo.service.BillService;

@RestController
@CrossOrigin
public class BillController {
	
	@Autowired
	private BillService billService;
	
	@Autowired
	private BillRepository billRepository;
	
	@PostMapping("/selectItem")
	public ResponseEntity<?> selectItem(@RequestBody Bill bill){
		LocalDate lt = LocalDate.now();
		bill.setTime(lt);
		if(this.billService.selectItem(bill)) {
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS, "You have selected this item!"));
		}else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE, "You can not select this item!"));
		}
	}
	
	@GetMapping("/getBill")
	public ResponseEntity<List<Bill>> getBillByUserId(){
		List<Bill> bills = (List<Bill>) this.billRepository.findAll();
		return new ResponseEntity<List<Bill>>(bills, HttpStatus.OK);
	}
	
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
