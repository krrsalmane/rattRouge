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

    @Test
    void testGetAllBooks() {
        // Entities
        Book book1 = new Book(); book1.setId(1L); book1.setTitle("Angular");
        Book book2 = new Book(); book2.setId(2L); book2.setTitle("Spring Boot");

        List<Book> entities = List.of(book1, book2);

        // DTOs
        BookDTO dto1 = new BookDTO(); dto1.setId(1L); dto1.setTitle("Angular");
        BookDTO dto2 = new BookDTO(); dto2.setId(2L); dto2.setTitle("Spring Boot");

        List<BookDTO> dtoList = List.of(dto1, dto2);

        // Mock behavior
        when(repository.findAll()).thenReturn(entities);
        when(mapper.toDTOs(entities)).thenReturn(dtoList);

        // Call service
        List<BookDTO> result = service.getAllBooks();

        // Check
        assertEquals(2, result.size());
        assertEquals("Angular", result.get(0).getTitle());
        assertEquals("Spring Boot", result.get(1).getTitle());
    }
}