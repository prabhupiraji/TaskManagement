import { Component, OnInit } from '@angular/core';
// import { UserModel } from './UserModel';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { UsermodelService } from '../usermodel.service';
import { UserModel } from '../usermodel';
import { ViewTaskListComponent } from '../view-task-list/view-task-list.component';
// import { userModel } from './usermodel';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  task: UserModel = new UserModel();
  constructor( private service:UsermodelService,private router: Router, private http: HttpClient,) {}
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  // ngOnInit(): void {
  //   throw new Error('Method not implemented.');
  //   // this.savetask();
    
  // }


  savetask(){
    this.service.createtasklist(this.task).subscribe(data => {
      console.log(data);
    },
    error => console.log(error));
  }

  onSubmit(){
    console.log(this.task)
    this.savetask();
    // this.router.navigate(['/view-task-list']);
  }
 
}
