package com.marolix.SpringBootDataJpaProject;

import org.springframework.data.repository.CrudRepository;

public interface BooksRepo extends CrudRepository<BooksEntity, Integer>{

}
