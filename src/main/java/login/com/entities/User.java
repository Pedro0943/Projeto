package login.com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private String email;
	private String passaword;
	
	public User() {
		
	}

	public User(String email, String passaword) {
		this.email = email;
		this.passaword = passaword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassaword() {
		return passaword;
	}

	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}
	
	
	
	
	
}
