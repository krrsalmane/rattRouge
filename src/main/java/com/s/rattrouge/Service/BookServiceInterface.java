package com.s.rattrouge.Service;

import com.s.rattrouge.Dto.BookDTO;
import java.util.List;

public interface BookServiceInterface {
    BookDTO addBook(BookDTO dto);
    List<BookDTO> getAllBooks();
}