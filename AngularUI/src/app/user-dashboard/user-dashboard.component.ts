import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../model/admin';
import { Bill } from '../model/bill';
import { Item } from '../model/item';

import { UserService } from '../service/user.service';

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent implements OnInit {

  bill:Bill;
  currentUser:Admin;
  itemDetail:any;
  item:Item;
  isError: boolean = false;
  errMessage: string = '';
  
  

  constructor(public userService: UserService, private router : Router) { 
    this.currentUser = new Admin();
    this.item  = new Item();
    this.bill = new Bill(this.item);
  }

  ngOnInit(): void {
    let that = this;
   
    this.userService.itemList().subscribe((data) => this.itemDetail=data);
    this.userService.getUserByEmail(<string>localStorage.getItem("email")).subscribe((data) => this.currentUser=data);
 
   
  }

  logout(){
    this.userService.logout();
    this.router.navigate(['/homepage']);
  }

  addToCart(id:number,name:string){
    this.bill.userId=this.currentUser.id;
    this.bill.userName=this.currentUser.name;
    this.bill.item.id=id;
    console.log(this.currentUser.id);
    
    
    let that=this;
    console.log(this.bill);

      this.userService.selectItem(this.bill)
        .subscribe({
          next(data: { description: any; }) {
            console.log('next call');
            console.log(data.description);
            alert("You have selected item "+name);
            that.router.navigate(['userDashboard']);
         },
          error(data: { error: { description: string; }; }): any {
            console.log('error call')
            console.log(data.error)
            that.isError = true;
            that.errMessage = data.error.description
            console.log(that.errMessage)
            that.router.navigate(['userDashboard']);
          }
        });
    }
    myCart(){
      console.log(this.currentUser.id);
      this.router.navigate(['cart',this.currentUser.id]);
    }
    
    

  }




