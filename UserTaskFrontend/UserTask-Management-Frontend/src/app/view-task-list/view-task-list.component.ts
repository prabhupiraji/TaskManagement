import { Component } from '@angular/core';
import { UserModel } from '../usermodel';
import { ActivatedRoute } from '@angular/router';
import { UsermodelService } from '../usermodel.service';

@Component({
  selector: 'app-view-task-list',
  templateUrl: './view-task-list.component.html',
  styleUrls: ['./view-task-list.component.css']
})
export class ViewTaskListComponent {
  task: UserModel
  data: any;
  constructor(private route: ActivatedRoute,
    private usermodelservice :UsermodelService ){}

    ngOnInit(): void {
     
      this.usermodelservice.gettaskList().subscribe((result) => {
        console.warn("result" ,result);
        this.data=result;
      })

    }
}
