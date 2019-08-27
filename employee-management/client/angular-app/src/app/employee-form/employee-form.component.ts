import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';
import { EmployeeServiceService } from '../service/employee/employee-service.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-employee-form',
  templateUrl: './employee-form.component.html',
  styleUrls: ['./employee-form.component.css']
})
export class EmployeeFormComponent  {

  employee: Employee;

  constructor(private route: ActivatedRoute, private router: Router, private employeeServiceService: EmployeeServiceService) {
    this.employee = new Employee();
  }

  onSubmit() {
    this.employeeServiceService.save(this.employee).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/employees']);
  }
}
