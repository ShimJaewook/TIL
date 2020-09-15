package com.vega2k.myspringboot.repository;

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
	
	@Test
	public void account() throws Exception {
		System.out.println(repository.getClass().getName());
		// 1. Account 객체 생성 -> 등록
		Account account = new Account();
		account.setUsername("boot");
		account.setPassword("1234");
		
		Account addAccount = repository.save(account);
		System.out.println(addAccount.getId() + " " + addAccount.getUsername());
		
	}
}
