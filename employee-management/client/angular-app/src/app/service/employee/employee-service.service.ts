import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Employee } from '../../model/employee';

@Injectable()
export class EmployeeServiceService {

  private usersUrl: string;

  constructor(private http: HttpClient)
  {
    this.usersUrl = 'http://localhost:8080/employees';
  }

  public findAll(): Observable<Employee[]>
  {
    return this.http.get<Employee[]>(this.usersUrl);
  }

  public findById(employeeId: number)
  {
    return this.http.get<Employee>(this.usersUrl +"/"+ employeeId);
  }

  public save(employee: Employee)
  {
    return this.http.post<Employee>(this.usersUrl, employee);
  }

  public update(employee: Employee) {
    return this.http.put<Employee>(this.usersUrl, employee);
  }

  public delete(employeeId: number)
  {
    return this.http.delete<Employee>(this.usersUrl + "/" + employeeId);
  }
}
