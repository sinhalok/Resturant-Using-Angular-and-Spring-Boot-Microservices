package com.admin.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.demo.model.Bill;
import com.admin.demo.repository.BillRepository;


@Service
public class BillService {
        @Autowired 
        private BillRepository billRepository;
        
        public boolean selectItem(Bill bill) {
			 this.billRepository.save(bill);
			 return true;
        }
        
}
