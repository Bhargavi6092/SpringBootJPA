package com.marolix.SpringBootDataJpaProject;

import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringBootDataJpaProjectApplication.class, args);
		
		BooksEntity book=new BooksEntity(4,"The Hunger Games "," Suzanne Collins");
		BooksService book1=con.getBean(BooksService.class);
		System.out.println(book1.insertEntity(book));
		//System.out.println(book1.readEntity(book));
		//System.out.println(book1.updateEntity(1, "The Lord of the Rings", "bhsa"));
		//book1.deleteEntity(1);
		//System.out.println(book1.readAllEntities());
		//TreeSet<Integer> ts=new TreeSet<Integer>();
		/*ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		*/
		//System.out.println(book1.readAll(ts));
	}

}
