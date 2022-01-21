import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Admin } from '../model/admin';
import { Bill } from '../model/bill';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  username: any;
  url:string = "http://localhost:8001/"
  constructor(private router: Router, private http: HttpClient) { }

  isLoggedIn() {
    this.username = localStorage.getItem('email');
    return !!localStorage.getItem('email');

  }

  logout() {
    localStorage.removeItem('email');
  }

  // this function is used for admin login
  userLogin(user: Admin): Observable<any> {
    return this.http.post<any>(this.url + 'userLogin', user);
  }

  addUser(user: Admin):  Observable<any> {
    return this.http.post<any>(this.url + 'insertUser', user);
  }


  itemList(){
    return  this.http.get(this.url + 'allItems');
  }

  getUserByEmail(email:string){
    return this.http.get(this.url + 'findUserByEmail/'+email);
  }

  selectItem(bill: Bill): Observable<any> {
    return this.http.post<any>(this.url + 'selectItem',bill);
  }
  getBill(){
    return  this.http.get(this.url + 'getBill');
  }
  getTotalPrice(id:number){
    return this.http.get(this.url + 'getBillByUserId/'+id);
  }

  deleteBillById(id:number){
    return this.http.delete(this.url + 'deleteBillById/'+id);
  }
  


}
