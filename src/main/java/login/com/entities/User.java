package login.com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import login.com.dto.UserRequestDTO;

@Entity
@Table(name = "tb_users")
public class User {
	
	@Id
	private String email;
	private String password;
	
	public User(){
		
	}
	
	public User(UserRequestDTO saveUser){
		
		email = saveUser.email();
		password = saveUser.password();
		
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
