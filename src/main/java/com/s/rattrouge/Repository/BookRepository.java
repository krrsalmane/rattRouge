package com.s.rattrouge.Repository;
import com.s.rattrouge.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BookRepository extends JpaRepository<Long , Book> {



}
