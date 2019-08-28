import { Component, OnInit ,Input} from '@angular/core';
import { Employee } from '../model/employee';
import { EmployeeServiceService } from '../service/employee/employee-service.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  @Input('employees') employees:any;

  //employees: Employee[];
  constructor(private route: ActivatedRoute, private router: Router, private employeeServiceService: EmployeeServiceService)
  {

  }

  ngOnInit() { }

  onClick(event)
  {
    console.log(event.currentTarget.id);///needs to be completed
    //this.employeeServiceService.delete(event.currentTarget.id).subscribe(data => this.gotoUserList(data));
   // await this.employeeServiceService.delete(event.currentTarget.id).toPromise(data => this.gotoUserList());
    this.employeeServiceService.delete(event.currentTarget.id)
         .subscribe(
        data => console.log('success', data),
           error => this.gotoUserList(error)
      );
  }
  gotoUserList(res)
  {
    console.log(this.router.url);
    this.router.navigate(['/employees']);
    console.log('oops',res)
  }


  /*
  ngOnInit()
  {
    this.employeeServiceService.findAll().subscribe(data => this.employees = data);
  }
  */

}
