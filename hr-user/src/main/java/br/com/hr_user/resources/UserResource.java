package br.com.hr_user.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.hr_user.entities.User;
import br.com.hr_user.repositories.UserRepository;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@Autowired
	private UserRepository repository;

	@GetMapping
	public ResponseEntity<List<User>> findAll(){

		List<User> list = repository.findAll();
		
		if(!list.isEmpty()) {
			return ResponseEntity.ok(list);
		}
		return ResponseEntity.badRequest().build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){

		User obj = repository.findById(id).get();
		
		if(obj != null) {
			return ResponseEntity.ok(obj);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/search")
	public ResponseEntity<User> findBy(@RequestParam String email){

		User obj = repository.findByEmail(email);
		
		if(obj != null) {
			return ResponseEntity.ok(obj);
		}
		return ResponseEntity.notFound().build();
	}
}
