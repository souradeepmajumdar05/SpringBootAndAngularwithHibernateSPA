import { Component, OnInit ,Input} from '@angular/core';
import { Employee } from '../model/employee';
import { EmployeeServiceService } from '../service/employee/employee-service.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  @Input('employees') employees:any;

  //employees: Employee[];

  constructor(){}
  ngOnInit(){}
/*
  constructor(private employeeServiceService: EmployeeServiceService)
  {

  }

  ngOnInit()
  {
    this.employeeServiceService.findAll().subscribe(data => this.employees = data);
  }
  */

}
