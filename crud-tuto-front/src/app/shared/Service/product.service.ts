import { Injectable } from '@angular/core';
import { environment } from '../../../environments/environment';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  API_URL !: string;
  
  constructor(private httpClient: HttpClient) {
        this.API_URL = environment.backendApiUrl;
  }
  getAllProducts() {
    return this.httpClient.get(`${this.API_URL}/all-products`)
  }
  addProduct(product : any) {
    return this.httpClient.post(`${this.API_URL}/add-product`, product)
  }
  editProduct(product : any){
    return this.httpClient.put(`${this.API_URL}/edit-product`, product)
  }
  deleteProduct(idProduct : any){
    return  this.httpClient.delete(`${this.API_URL}/delete-product/${idProduct}`)
  }

}
