package com.ZGY.Servlet.Dao;



import java.util.List;

import com.ZGY.Servlet.pojo.User;

public interface IUserDAO {
	public abstract List<User> findAll();
	void add(User user);
	void delete(Integer id);
	void update(User user);
	User findById(Integer id);
	
}
