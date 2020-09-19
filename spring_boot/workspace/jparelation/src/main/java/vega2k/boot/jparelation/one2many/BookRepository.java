package vega2k.boot.jparelation.one2many;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Long> {
	@Query("select b from Book b join fetch b.pages where b.isbn = :isbn")
    Book findByIsbn(@Param("isbn") String isbn);
}