package test3.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import test3.User;

@Service  
@Repository()
public interface TestService {

	public String saveData(User user);
}
