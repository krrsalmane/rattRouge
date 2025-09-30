import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RouterLink } from '@angular/router';

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
  private apiUrl = 'http://localhost:8083/api/books';

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.loadBooks();
  }

  loadBooks() {
    this.http.get<Book[]>(`${this.apiUrl}/all`).subscribe({
      next: (books) => {
        this.books = books;
      },
      error: (error) => {
        console.error('Error loading books:', error);
      }
    });
  }

  refreshBooks() {
    this.loadBooks();
  }
}
