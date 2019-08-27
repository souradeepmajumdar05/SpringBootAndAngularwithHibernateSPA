import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeServiceService } from '../service/employee/employee-service.service';

@Component({
  selector: 'app-employee-search-form',
  templateUrl: './employee-search-form.component.html',
  styleUrls: ['./employee-search-form.component.css']
})
export class EmployeeSearchFormComponent  {

  employee: Employee;
  employees: Employee[] =[];

  constructor(private route: ActivatedRoute, private router: Router, private employeeServiceService: EmployeeServiceService) {
    this.employee = new Employee();
  }

  onSubmit() {
    this.employees.pop();
    this.employeeServiceService.findById(this.employee.id).subscribe(data =>this.employees.push(data));
  }

  gotoUserList() {
    this.router.navigate(['/employees']);
  }

} 
