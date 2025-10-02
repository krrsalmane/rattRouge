import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RouterLink } from '@angular/router';
import { BooksService } from '../../services/books.service';

interface Book {
  id?: number;
  title: string;
  author: string;
  available: boolean;
}

@Component({
  selector: 'app-library',
  standalone: true,
  imports: [CommonModule, HttpClientModule, RouterLink],
  templateUrl: './library.component.html',
  styleUrl: './library.component.css'
})
export class LibraryComponent implements OnInit {
  books: Book[] = [];

  constructor(private service:BooksService) {}

  ngOnInit() {
    this.loadBooks();
  }

  loadBooks() {
   this.service.loadBooks().subscribe((data)=>{
    this.books=data
   })
  }

}
