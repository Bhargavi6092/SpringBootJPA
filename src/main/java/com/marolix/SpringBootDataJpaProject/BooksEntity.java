package com.marolix.SpringBootDataJpaProject;


	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;


		@Entity
		@Table(name="BooksData")
		public class BooksEntity {
			
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int book_id;
			@Column
		private String book_title;
			@Column
		private String author_name;

		public int getBook_id() {
			return book_id;
		}
		public void setBook_id(int book_id) {
			this.book_id = book_id;
		}
		public String getBook_title() {
			return book_title;
		}
		public void setBook_title(String book_title) {
			this.book_title = book_title;
		}
		public String getAuthor_name() {
			return author_name;
		}
		public void setAuthor_name(String author_name) {
			this.author_name = author_name;
		}
		
		public BooksEntity(int book_id, String book_title, String author_name) {
			super();
			this.book_id = book_id;
			this.book_title = book_title;
			this.author_name = author_name;
		}
		public BooksEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "BooksEntity [book_id=" + book_id + ", book_title=" + book_title + ", author_name=" + author_name
					+ "]";
		}

		}