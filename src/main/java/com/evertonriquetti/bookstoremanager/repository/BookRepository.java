package com.evertonriquetti.bookstoremanager.repository;

import com.evertonriquetti.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
