package com.adamoubello.repositories;

import com.adamoubello.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}
