import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeFormComponent } from './employee-form/employee-form.component';
import { EmployeeSearchFormComponent } from './employee-search-form/employee-search-form.component';

const routes: Routes = [
  { path: 'employees', component: EmployeeListComponent },
  { path: 'addemployees', component: EmployeeFormComponent },
  { path: 'searchemployees', component: EmployeeSearchFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
