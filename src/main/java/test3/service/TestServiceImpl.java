package test3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import test3.User;
import test3.dao.Dao;

@Service  
@Repository()
public class TestServiceImpl implements TestService {
	@Autowired
	Dao dao;
	
	@Override  
	public String saveData(User user) {
		return dao.saveData(user);
	}
}
