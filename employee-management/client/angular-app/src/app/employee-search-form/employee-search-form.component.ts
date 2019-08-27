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

  constructor(private route: ActivatedRoute, private router: Router, private employeeServiceService: EmployeeServiceService) {
    this.employee = new Employee();
  }

  onSubmit() {
    this.employeeServiceService.findById(this.employee.id).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/employees']);
  }

}
