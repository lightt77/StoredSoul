import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/dataservice/data.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  private productTitle: string;
  private price: number;
  private type: string;
  private productId: string;       // comes from catalogue page

  constructor(private dataService: DataService) {
    this.productTitle = "Default title";
    this.price = 499;
    this.type = "tshirt";
  }

  ngOnInit() {
    this.dataService.currentMessage
      .subscribe(message => this.productId = message);
  }

}
