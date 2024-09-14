package br.com.hr_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hr_user.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String Email);
}
