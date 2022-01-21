import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Admin } from '../model/admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  username: any;
  url: string = "http://localhost:8000/"
  constructor(private router: Router, private http: HttpClient) { }

  isLoggedIn() {
    this.username = localStorage.getItem('email');
    return !!localStorage.getItem('email');

  }

  logout() {
    localStorage.removeItem('email');
  }

  // this function is used for admin login
  adminLogin(admin: Admin): Observable<any> {
    return this.http.post<any>(this.url + 'adminLogin', admin);
  }

  allTodayBill(){
    return this.http.get(this.url + 'allTodayBill')
  }


}
