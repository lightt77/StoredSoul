import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-product-catalogue-tile',
  templateUrl: './product-catalogue-tile.component.html',
  styleUrls: ['./product-catalogue-tile.component.css']
})
export class ProductCatalogueTileComponent implements OnInit {
  @Input() title: string;
  @Input() price: number;
  @Input() type: string;
  @Input() imagePath: string;

  constructor() {
    this.imagePath+='?h=282&w=282';
  }

  ngOnInit() {
  }

}
