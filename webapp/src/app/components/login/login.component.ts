import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { environment } from '../../../environments/environment';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  shouldDisplayError: boolean;
  constructor(private httpClient: HttpClient) {
    this.shouldDisplayError = false;
  }

  ngOnInit() {
  }

  onLoginSubmit(fields: any) {
    this.httpClient.post(environment.baseServerUrl + "login", { "emailId": fields.userName, "password": fields.password })
      .subscribe(response => {
        if (response === true) {
          // route to home page
          
        }
        else {
          // display the error
          this.shouldDisplayError = true;
        }
      });
  }
}
