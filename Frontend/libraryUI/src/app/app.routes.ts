import { Routes } from '@angular/router';
import { BookComponent } from './components/book/book.component';
import { LibraryComponent } from './components/library/library.component';

export const routes: Routes = [
  { path: '', redirectTo: '/library', pathMatch: 'full' },
  { path: 'library', component: LibraryComponent },
  { path: 'add-book', component: BookComponent }
];
