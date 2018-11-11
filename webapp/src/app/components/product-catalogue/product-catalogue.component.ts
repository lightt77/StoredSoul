import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { IProduct } from './../../models/IProduct';

@Component({
  selector: 'app-product-catalogue',
  templateUrl: './product-catalogue.component.html',
  styleUrls: ['./product-catalogue.component.css']
})
export class ProductCatalogueComponent implements OnInit {
  private productList = [];

  constructor(private httpClient: HttpClient) {
    httpClient.get<IProduct[]>("http://localhost:8080/products")
      .subscribe(data => {
        data.forEach(element=>{
          this.productList.push(element);
        });
      });
  }

  ngOnInit() {
  }

}