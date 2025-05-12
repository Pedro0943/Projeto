package login.com.login.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import login.com.login.dto.UserDTO;
import login.com.login.dto.UserRequestDTO;
import login.com.login.entities.User;
import login.com.login.repositories.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Transactional(readOnly = true)
	public List<UserDTO> findAll(){
		List<User> result = userRepository.findAll();
		return result.stream().map(x -> new UserDTO(x)).toList();
	}
	

	public void saveUser(UserRequestDTO saveUser) {
		User user = new User(saveUser);
		userRepository.save(user);	
	}
}
