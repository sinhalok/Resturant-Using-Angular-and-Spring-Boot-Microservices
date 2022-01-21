import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../service/admin.service';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {
  todayBill:any;

  constructor(public adminService:AdminService, private router : Router) { }

  ngOnInit(): void {
    this.adminService.allTodayBill().subscribe((data) => this.todayBill=data);
  }

  logout(){
    this.adminService.logout();
    this.router.navigate(['/homepage']);
  }
}
