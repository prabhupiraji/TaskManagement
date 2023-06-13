import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewTaskListComponent } from './view-task-list/view-task-list.component';
import { TaskComponent } from './task/task.component';

const routes: Routes = [
  // { path: '', redirectTo: 'task', pathMatch: 'full' },
  { path: 'task', component: TaskComponent },
  // {path: 'getalltask', component: ViewTaskListComponent},
  { path: 'view-task-list', component: ViewTaskListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
