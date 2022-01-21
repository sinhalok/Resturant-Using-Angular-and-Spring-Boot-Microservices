import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../service/admin.service';

@Component({
  selector: 'app-today-bill',
  templateUrl: './today-bill.component.html',
  styleUrls: ['./today-bill.component.css']
})
export class TodayBillComponent implements OnInit {

  todayBill:any;
  constructor(public adminService:AdminService,public router:Router) { }

  ngOnInit(): void {
    this.adminService.allTodayBill().subscribe((data) => this.todayBill=data);
  }

  
  logout(){
    this.adminService.logout();
    this.router.navigate(['/home']);
  }

}
