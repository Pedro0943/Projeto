package login.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.com.dto.UserDTO;
import login.com.dto.UserRequestDTO;
import login.com.services.UserService;

@RestController
@RequestMapping(value = "/register")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/users")
	public List<UserDTO> findAll(){
		List<UserDTO> result = userService.findAll();
		return result;
	}
	
	@PostMapping
	public void saveUser(@RequestBody UserRequestDTO saveUser) {
		userService.saveUser(saveUser);
		
	}
}
