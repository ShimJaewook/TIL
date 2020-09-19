package vega2k.boot.jparelation.paging;

import java.util.stream.IntStream;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PagingTest {
	@Autowired
	TutorialRepository repository;
	
	@Test @Ignore
	public void select() {
		
	}
	
	@Test //@Ignore
	public void insert() {
		IntStream.range(0, 16).forEach(this::generateTutorial);

	}
	
	private Tutorial generateTutorial(int index) {
		String title = "";
		boolean published = false;
		if(index <=9) {
			title = index + " title";
		}else {
			title = index + " data";
			published = true;
		}
		String description = index + "description";
        Tutorial tutorial = new Tutorial(title, description, published);
        return this.repository.save(tutorial);
    }
}
