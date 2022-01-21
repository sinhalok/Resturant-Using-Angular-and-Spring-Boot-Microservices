import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../model/admin';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {
  isError: boolean = false;
  errMessage: string = '';
  user:Admin;

  constructor(private userService:UserService, private router:Router) { 
    this.user = new Admin();
  }

  ngOnInit(): void {
  }

  login(){
    let cuser = this.user;
    let email1: string = cuser.email!;
    let that = this;
    this.userService.userLogin(this.user)
      .subscribe({
        next(data: { description: string; }) {
          localStorage.setItem('email', email1);
          alert("You have login successfuly!");
          that.router.navigate(['/userDashboard']);
        },
        error(data: { error: { description: string; }; }): any {
         
          that.isError = true;
          that.errMessage = data.error.description
          console.log(that.errMessage)
          alert("Admin credential wrong!");
          that.router.navigate(['/userLogin']);
        }
      });
  }

}
