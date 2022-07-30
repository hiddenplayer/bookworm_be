package com.nash.bookworm.repo;

import com.nash.bookworm.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findByCategoryId(Long id);

    List<Book> findByAuthorId(Long id);
}
