package login.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import login.com.dto.UserDTO;
import login.com.dto.UserRequestDTO;
import login.com.entities.User;
import login.com.repositories.UserRepository;

public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(String email) {
		User result = userRepository.findById(email).get();
		UserDTO dto = new UserDTO(result);
		return dto;
	}
	
	
	@Transactional(readOnly = true)
	public List<UserDTO> findAll(){
		List<User> result = userRepository.findAll();
		return result.stream().map(x -> new UserDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public void saveUser(UserRequestDTO saveUser) {
		User user = new User(saveUser);
		userRepository.save(user);	
	}
}
