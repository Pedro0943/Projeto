package login.com.login.dto;


import login.com.login.entities.User;

public class UserDTO {
	
	private String email;
	private String password;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User entity) {
		
		email = entity.getEmail();
		password = entity.getPassword();
	
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	

}
