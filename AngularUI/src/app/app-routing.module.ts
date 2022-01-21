import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { CartComponent } from './cart/cart.component';

import { HomepageComponent } from './homepage/homepage.component';
import { TodayBillComponent } from './today-bill/today-bill.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';

const routes: Routes = [
  { path: '', redirectTo: 'homepage', pathMatch:'full'},
  { path: 'homepage', component:HomepageComponent },
  { path: 'adminLogin', component:AdminLoginComponent },
  { path: 'adminDashboard', component:AdminDashboardComponent },
  { path: 'userLogin', component:UserLoginComponent},
  { path: 'userDashboard', component:UserDashboardComponent},
  { path: 'userRegister', component:UserRegistrationComponent},
  {path:'cart/:id',component:CartComponent},
  {path:'todayBill',component:TodayBillComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
