package vega2k.boot.jparelation.one2many;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import vega2k.boot.jparelation.member.Member;
import vega2k.boot.jparelation.member.MemberClassRepository;
import vega2k.boot.jparelation.member.Phone;
import vega2k.boot.jparelation.one2many.Book;
import vega2k.boot.jparelation.one2many.BookRepository;
import vega2k.boot.jparelation.one2many.Page;
import vega2k.boot.jparelation.one2many.PageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class One2ManyTest {
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private PageRepository pageRepository;
	
	@Test //@Ignore
	public void list() throws Exception {
		
		  Book book = bookRepository.findByIsbn("123456");
		  //Set<Page> pages = book.getPages();	
		  System.out.println("=========================");
		  System.out.println(book.getTitle());
		  Set<Page> pages = book.getPages();
		  for (Page page : pages) {
			System.out.println(page.getChapter() + " " + page.getContent());
		  }
		  System.out.println("<<=========================");
		  
		  
//	      List<Page> pages =  pageRepository.findByBook(book, Sort.by("content"));
//	      System.out.println("=========> pages" + pages);
//	        for (Page page : pages) {
//				System.out.println(page);
//			}
	}

	@Test @Ignore
	public void insert() throws Exception {
		// create a new book
        Book book = new Book("Java 101", "John Doe", "123456");

        // save the book
        bookRepository.save(book);

        // create and save new pages
        pageRepository.save(new Page(1, "Introduction contents", "Introduction", book));
        pageRepository.save(new Page(65, "Java 8 contents", "Java 8", book));
        pageRepository.save(new Page(95, "Concurrency contents", "Concurrency", book));

        // create a new book
        Book book2 = new Book("Java 201", "Jame Doe", "456789");

        // save the book
        bookRepository.save(book2);

        // create and save new pages
        pageRepository.save(new Page(2, "Introduction contents", "Introduction", book2));
        pageRepository.save(new Page(85, "Java 9 contents", "Java 9", book2));
        pageRepository.save(new Page(100, "Thread contents", "Thread", book2));

        
	}

}