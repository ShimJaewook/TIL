package vega2k.boot.jparelation.one2one;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import vega2k.boot.jparelation.one2one.Address;
import vega2k.boot.jparelation.one2one.User;
import vega2k.boot.jparelation.one2one.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class One2OneTest {
	@Autowired
	UserRepository userRepository;
	
	@Test @Ignore
	public void select() {
		Optional<User> userOpt = userRepository.findById(1L);
		User user = userOpt.get();
		System.out.println(user.getName() + " " + user.getEmail());
		Address address = user.getAddress();
		System.out.println(address);
	}
	
	@Test //@Ignore
	public void insert() {
        // create a user instance
        User user = new User("John Doe", "john.doe@example.com", "1234abcd");

        // create an address instance
        Address address = new Address("Lake View 321", "Berlin", "Berlin",
                "95781", "DE");

        // set child reference
        address.setUser(user);

        // set parent reference
        user.setAddress(address);

        // save the parent
        // which will save the child (address) as well
        userRepository.save(user);
	}
}
