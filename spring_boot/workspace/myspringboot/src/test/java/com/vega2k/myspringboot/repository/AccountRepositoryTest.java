package com.vega2k.myspringboot.repository;

import java.util.List;
import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vega2k.myspringboot.entity.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRepositoryTest {

	@Autowired
	private AccountRepository repository;
	
	@Test  @Ignore
	public void update() {
		Optional<Account> findById = repository.findById(2L);
		
		//요청한 ID를 가진 Account가 있으면 갱신하기
		if(findById.isPresent()) {
			Account account = new Account();
			account.setEmail("dooly22@aa.com");
			repository.save(account);
		}
	}
	
	
	@Test
	public void finder() {
		Account account = repository.findByUsername("test");
		System.out.println(account);
	
		Optional<Account> optional = repository.findById(1L);
		System.out.println(optional.isPresent());
		if(optional.isPresent()) {
			Account acoount2 = optional.get();
			System.out.println(acoount2);			
		}
		
		// 요청 ID가 있으면 Account 객체를 반환하고, 없으면 예외를 발생시킴.
		Optional<Account> optEmail = repository.findByEmail("dooly@aa.com");
		// Suppler의 함수형 인터페이스의 T get()
		Account account3 = optEmail.orElseThrow(() -> new RuntimeException("요청한 Email주소를 가진 Account가 없음!"));
		System.out.println(account3);
		
		List<Account> accountList = repository.findAll(); //Iterable 타입을 반환. 리스트는 iterable의 하위여서 받을 수 있음.
		accountList.forEach(acct -> System.out.println(acct)); // 람다식
		accountList.forEach(System.out::println); // method reference 	
	}
	
	@Test @Ignore
	public void account() throws Exception {
		System.out.println(repository.getClass().getName());
		// 1. Account 객체 생성 -> 등록
		Account account = new Account();
		account.setUsername("test");
		account.setPassword("1234");
		account.setEmail("dooly@aa.com");
		
		Account addAccount = repository.save(account);
		System.out.println(addAccount.getId() + " " + addAccount.getUsername());
	}
}
