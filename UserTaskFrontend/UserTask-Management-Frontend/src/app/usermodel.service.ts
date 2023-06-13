import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserModel } from './usermodel';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsermodelService {

  
    constructor(private httpClient: HttpClient) { }

    private baseURL = "http://localhost:9086/user/task";
    private URL = "http://localhost:9086/user/getalltask";
  
    gettaskList(){
      return this.httpClient.get(this.URL);
    }
  
    createtasklist(task: UserModel): Observable<Object>{
      return this.httpClient.post(`${this.baseURL}`, task);
    }
   }

