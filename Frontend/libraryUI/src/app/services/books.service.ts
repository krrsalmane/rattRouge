import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


interface Book {
  id?: number;
  title: string;
  author: string;
  available: boolean;
}

@Injectable({
  providedIn: 'root'
})
export class BooksService {

  constructor(private http:HttpClient) {}
   
    private apiUrl = 'http://localhost:8083/api/books';


     loadBooks() : Observable <Book[]>{
    return this.http.get<Book[]>(`${this.apiUrl}/all`)

     }
      
    }




