import { Component, OnInit, SystemJsNgModuleLoader } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Admin } from '../model/admin';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

 
  userId:any;
  currentUser:Admin;
  cartDetail:any;
  totalPrice:any;
  constructor(public userService: UserService,public router:Router,public route:ActivatedRoute) {
    this.currentUser = new Admin();
    
   }
  

  ngOnInit(): void {
    this.userId=this.route.snapshot.params['id'];
    this.userService.getBill().subscribe((data) => this.cartDetail=data); 
    this.userService.getUserByEmail(<string>localStorage.getItem("email")).subscribe((data)=>this.currentUser = data);
    this.userService.getTotalPrice(this.userId).subscribe((data)=>this.totalPrice=data);


  }
  

  logout(){
    this.userService.logout();
    this.router.navigate(['/homepage']);
  }

  delete(id:number){
    
    this.userService.deleteBillById(id).subscribe(data=>{
      console.log(data);
      window.location.reload();
      this.router.navigate(['/cart']);

    },err=>{
      console.log(err);
    });
    
    
  }




 

}
