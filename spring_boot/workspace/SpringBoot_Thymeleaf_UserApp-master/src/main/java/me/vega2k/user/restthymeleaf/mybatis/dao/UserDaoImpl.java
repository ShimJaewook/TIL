package me.vega2k.user.restthymeleaf.mybatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.vega2k.user.restthymeleaf.mybatis.mapper.UserMapper;
import me.vega2k.user.restthymeleaf.mybatis.vo.User;


@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserMapper userMapper;	
	
	@Override
	public User read(Long id) {
		User user  = userMapper.selectUserById(id);
		return user;
	}
	
	public List<User> readAll() {
		List<User> userList = userMapper.selectUserList();
		return userList;
	}

	public void insert(User user) {
		userMapper.insertUser(user);
		System.out.println("Id " + user.getId() + 
				" Name=" + user.getName());
	}

	@Override
	public void update(User user) {
		userMapper.updateUser(user);
	}
	
	@Override
	public void delete(Long id) {
		userMapper.deleteUser(id);
		System.out.println("Record with ID = " + id ); 
	}
}







