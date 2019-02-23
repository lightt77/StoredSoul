import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { environment } from '../../../environments/environment';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  shouldDisplayError: boolean;
  constructor(private httpClient: HttpClient, private router: Router) {
    this.shouldDisplayError = false;
  }

  ngOnInit() {
  }

  onLoginSubmit(fields: any) {
    this.httpClient.post(environment.baseServerUrl + "login", { "emailId": fields.userName, "password": fields.password })
      .subscribe(response => {
        if (response === true) {
          // route to home page
          this.router.navigate(['/home']);
        }
        else {
          // display the error
          this.shouldDisplayError = true;
        }
      });
  }
}
