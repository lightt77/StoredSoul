import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  private productTitle: string;
  private price: number;
  private type: string;

  constructor() {
    this.productTitle = "Default title";
    this.price = 499;
    this.type = "tshirt";
  }

  ngOnInit() {
  }

}
