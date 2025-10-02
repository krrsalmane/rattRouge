package com.s.rattrouge.Service.Impl;
import org.junit.jupiter.api.Test;

import com.s.rattrouge.Dto.BookDTO;
import com.s.rattrouge.Entity.Book;
import com.s.rattrouge.Mapper.BookMapper;
import com.s.rattrouge.Repository.BookRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class BookServiceImplTest {

    BookRepository repository = mock(BookRepository.class);
    BookMapper mapper = mock(BookMapper.class);
    BookServiceImpl service = new BookServiceImpl(repository, mapper);

    @Test
    void testAddBook() {
        // Input DTO
        BookDTO input = new BookDTO();
        input.setTitle("Spring Boot");
        input.setAuthor("John");

        // Entity and Saved Entity
        Book entity = new Book();
        entity.setTitle("Spring Boot");
        entity.setAuthor("John");

        Book savedEntity = new Book();
        savedEntity.setId(1L);
        savedEntity.setTitle("Spring Boot");
        savedEntity.setAuthor("John");

        // Output DTO
        BookDTO output = new BookDTO();
        output.setId(1L);
        output.setTitle("Spring Boot");
        output.setAuthor("John");

        // Mock behavior
        when(mapper.toEntity(input)).thenReturn(entity);
        when(repository.save(entity)).thenReturn(savedEntity);
        when(mapper.toDTO(savedEntity)).thenReturn(output);

        // Call service
        BookDTO result = service.addBook(input);

        // Check
        assertEquals("Spring Boot", result.getTitle());
        assertEquals("John", result.getAuthor());
    }

}