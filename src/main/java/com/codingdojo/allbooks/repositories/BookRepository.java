package com.codingdojo.allbooks.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.allbooks.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
}
