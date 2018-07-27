import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})


export class UserServiceService {

  private userUrl = '/api';
  constructor(private http:HttpClient) { }

  public getHelloWorld(){
    console.log("got here!");
    return this.http.get(this.userUrl);
  }
}

