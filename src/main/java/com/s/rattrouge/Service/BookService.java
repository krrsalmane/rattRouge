package com.s.rattrouge.Service;
import com.s.rattrouge.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

}
