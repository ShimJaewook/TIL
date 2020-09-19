package com.vega2k.myspringboot.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vega2k.myspringboot.entity.Account;
import org.springframework.security.core.userdetails.User;
import com.vega2k.myspringboot.property.Vega2kProperties;
import com.vega2k.myspringboot.repository.AccountRepository;

@Service
public class AccountService implements UserDetailsService {
	private AccountRepository repository;
	private Vega2kProperties props;
	private final PasswordEncoder passwordEncoder;
	
	public AccountService(AccountRepository repository, Vega2kProperties props, PasswordEncoder encoder) {
		super();
		this.repository = repository;
		this.props = props;
		this.passwordEncoder = encoder;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException  {
		Optional<Account> optEmail = repository.findByEmail(email);
		Account account = optEmail.orElseThrow(() -> new UsernameNotFoundException(email + " Not Found"));
		return new User(account.getEmail(), account.getPassword(), authorities());
	}
	
	private Collection<? extends GrantedAuthority> authorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}
	
	public Account createAccount(String email, String password) {
		Account account = new Account();
		account.setUsername(email);
		account.setPassword(passwordEncoder.encode(password));
		return repository.save(account);
	}
	
	@PostConstruct
	public void init() {
		Optional<Account> optEmail = repository.findByEmail(props.getEmail());
		
		
		//이메일주소와 매칭되는 Account가 없으면
		if(!optEmail.isPresent()) {
			Account account = this.createAccount(props.getEmail(), props.getPassword());
			System.out.println(account);
		}
		
	}

}
