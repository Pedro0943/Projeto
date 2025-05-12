package login.com.login.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRequestDTO(
	    @NotBlank @Email String email,
	    @NotBlank String password
		
		) {

}
