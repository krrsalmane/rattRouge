import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RouterLink } from '@angular/router';

interface Book {
  id?: number;
  title: string;
  author: string;
  available: boolean;
}

@Component({
  selector: 'app-book',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule, RouterLink],
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})
export class BookComponent {
  newBook: Book = {
    title: '',
    author: '',
    available: true
  };

  private apiUrl = 'http://localhost:8083/api/books';

  constructor(private http: HttpClient) {}

  createBook() {
    if (this.newBook.title && this.newBook.author) {
      this.http.post<Book>(`${this.apiUrl}/add`, this.newBook).subscribe({
        next: (book) => {
          console.log('Book created successfully:', book);
          alert('Book created successfully!');
          this.newBook = { title: '', author: '', available: true };
        },
        error: (error) => {
          console.error('Error creating book:', error);
          alert('Error creating book. Please try again.');
        }
      });
    } else {
      alert('Please fill in both title and author.');
    }
  }
}
