package com.s.rattrouge.Service.Impl;
import com.s.rattrouge.Dto.BookDTO;
import com.s.rattrouge.Entity.Book;
import com.s.rattrouge.Mapper.BookMapper;
import com.s.rattrouge.Repository.BookRepository;
import com.s.rattrouge.Service.BookServiceInterface;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class BookServiceImpl implements BookServiceInterface {

    private  final BookRepository repository;
    private final BookMapper mapper;
    public BookServiceImpl(BookRepository repository, BookMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public BookDTO addBook(BookDTO dto) {
        Book book = mapper.toEntity(dto);
        Book savedBook = repository.save(book);
        return mapper.toDTO(savedBook);
    }



}