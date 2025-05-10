package login.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import login.com.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
