import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../model/admin';
import { AdminService } from '../service/admin.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  admin: Admin;
  isError: boolean = false;
  errMessage: string = '';
  constructor(public adminService:AdminService, private router: Router ) { 
    this.admin = new Admin();
  }

  ngOnInit(): void {
   
  }

  login(){
    let cuser = this.admin;
    let email1: string = cuser.email!;
    let that = this;
    this.adminService.adminLogin(this.admin)
      .subscribe({
        next(data: { description: string; }) {
          localStorage.setItem('email', email1);
          alert("You have login successfuly!");
          that.router.navigate(['/adminDashboard']);
        },
        error(data: { error: { description: string; }; }): any {
         
          that.isError = true;
          that.errMessage = data.error.description
          console.log(that.errMessage)
          alert("Admin credential wrong!");
          that.router.navigate(['/adminLogin']);
        }
      });
  }

}

