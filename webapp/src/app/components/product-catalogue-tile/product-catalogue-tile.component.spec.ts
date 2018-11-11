import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductCatalogueTileComponent } from './product-catalogue-tile.component';

describe('ProductCatalogueTileComponent', () => {
  let component: ProductCatalogueTileComponent;
  let fixture: ComponentFixture<ProductCatalogueTileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductCatalogueTileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductCatalogueTileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
