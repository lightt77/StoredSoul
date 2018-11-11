import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { RouterModule, Routes} from '@angular/router';
import { HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { HeaderComponent } from './components/header/header.component';
import { ProductComponent } from './components/product/product.component';
import { ProductCatalogueComponent } from './components/product-catalogue/product-catalogue.component';
import { ProductCatalogueTileComponent } from './components/product-catalogue-tile/product-catalogue-tile.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'products', component:ProductComponent}
];


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    ProductComponent,
    ProductCatalogueComponent,
    ProductCatalogueTileComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
