import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../model/admin';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent implements OnInit {

  user: Admin;
  isError: boolean = false;
  errMessage: string = '';

  constructor(private userService: UserService, private router: Router) {
    this.user = new Admin();
  }
  
  ngOnInit(): void {
  }

  userRegistration() {
    let that = this;
    this.userService.addUser(this.user)
      .subscribe({
        next(data: { description: any; }) {
          alert("You have registered successfuly!");
          that.router.navigate(['/userLogin']);
        },
        error(data: { error: { description: string; }; }): any {
          alert("You have already registered!");
          that.router.navigate(['/userRegister']);
        }
      });
  }


}
