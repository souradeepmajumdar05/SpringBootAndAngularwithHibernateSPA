import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';
import { EmployeeServiceService } from '../service/employee/employee-service.service';


@Component({
  selector: 'app-emlpoyee-complete-list',
  templateUrl: './emlpoyee-complete-list.component.html',
  styleUrls: ['./emlpoyee-complete-list.component.css']
})
export class EmlpoyeeCompleteListComponent implements OnInit {

  employees: Employee[];

  constructor(private employeeServiceService: EmployeeServiceService)
  {

  }

  ngOnInit()
  {
    this.employeeServiceService.findAll().subscribe(data => this.employees = data);
  }

  onLoad()
  {
    this.ngOnInit();
  }

}
