package vega2k.boot.jparelation.many2many;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import vega2k.boot.jparelation.one2one.Address;
import vega2k.boot.jparelation.one2one.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Many2ManyTest {
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CourseRepository courseRepository;
	
	
	@Test
	public void select() {
		List<Student> stuList = studentRepository.findByNameContaining("John Doe");
		for (Student student : stuList) {
			System.out.println(student);
		}
		
		List<Course> courseList = courseRepository.findByTitleContaining("Machine Learning");
		for (Course course : courseList) {
			System.out.println(course);
		}
		
		List<Course> courseList2 = courseRepository.findByFeeLessThan(1000);
		for (Course course : courseList2) {
			System.out.println(course);
		}
	}
	
	@Test @Ignore
	public void insert() {
		// create a student
        Student student = new Student("John Doe", 15, "8th");

        // save the student
        studentRepository.save(student);

        // create three courses
        Course course1 = new Course("Machine Learning", "ML", 12, 1500);
        Course course2 = new Course("Database Systems", "DS", 8, 800);
        Course course3 = new Course("Web Basics", "WB", 10, 100);

        // save courses 
        // saveAll - CrudRepository
        courseRepository.saveAll(Arrays.asList(course1, course2, course3));

        // add courses to the student 
        // addAll - HashSet
        student.getCourses().addAll(Arrays.asList(course1, course2, course3));

        // update the student
        studentRepository.save(student);
        
	}
}
