import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { environment } from '../../../environments/environment';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
  }

  onLoginSubmit(fields: any) {
    this.httpClient.post(environment.baseServerUrl + "login", { "emailId": fields.userName, "password": fields.password })
      .subscribe(data => console.log(data));
  }
}
