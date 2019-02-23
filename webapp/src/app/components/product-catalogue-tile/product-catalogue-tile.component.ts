import { Component, OnInit, Input } from '@angular/core';
import { DataService } from 'src/app/services/dataservice/data.service';
import { Router } from '@angular/router';

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
  @Input() productId: number;

  constructor(private dataService: DataService, private router: Router) {
    this.imagePath += '?h=282&w=282';
  }

  ngOnInit() {
  }

  onTileClick() {
    this.dataService.submitMessage(this.productId.toString());
    this.router.navigate(["/product-details/" + this.productId.toString()]);
  }
}
