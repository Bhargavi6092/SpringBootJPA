package com.marolix.SpringBootDataJpaProject;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

import javax.management.RuntimeErrorException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service(value = "booksService")
@Service
public class BooksService {
		@Autowired
		private BooksRepo booksRepo;

		public String insertEntity(BooksEntity entity) {
			booksRepo.save(entity);
			return "inserted successfully";
		}
		public BooksEntity readEntity(BooksEntity entity) {
			Optional<BooksEntity> optional = booksRepo.findById(entity.getBook_id());
			if (optional.isPresent())
				return optional.get();
			else
				return null;
		}
		
		public BooksEntity updateEntity(int book_id,String book_title,String author_name) {
			Optional<BooksEntity> optional = booksRepo.findById(book_id);
			if(optional.isPresent()) 
			{
				BooksEntity book=optional.get();
				book.setBook_id(book_id);
			    booksRepo.save(book);
			   return book;
			}else
				throw new RuntimeErrorException(null, "no id found with book_id" +book_id);	
			
		}
		public void deleteEntity(Integer id) {
//			demoRepo.deleteById(id);
			Optional<BooksEntity> dm = booksRepo.findById(id);
			// Supplier
			BooksEntity e = dm.orElseThrow(() -> new RuntimeException("no entity found with id " + id));

			booksRepo.delete(e);
			System.out.println("deleted successfully");
		}

		
		public List<BooksEntity> readAllEntities() {
			Iterable<BooksEntity> itr = booksRepo.findAll();
			List<BooksEntity> l = new ArrayList<BooksEntity>();
			for (BooksEntity i : itr) {
				l.add(i);
			}
			return l;
		}
		/*public List<BooksEntity> readAll(Set<Integer> s) {

			Iterable<BooksEntity> itr = booksRepo.findAllById(s);
			List<BooksEntity> l = new ArrayList<BooksEntity>();
			for (BooksEntity i : itr) {
				l.add(i);
			}
			return l;

		}*/
}