package com.s.rattrouge.Mapper;


import com.s.rattrouge.Dto.BookDTO;
import com.s.rattrouge.Entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface BookMapper {

    BookDTO toDTO(Book book);
    Book toEntity (BookDTO dto);
    List<BookDTO> toDTOs (List<Book> books);
}
