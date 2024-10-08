package br.com.hr_oauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.hr_oauth.entities.User;

@Component
@FeignClient(name= "hr-user", path="/users")
public interface UserFeignClient {
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email);
}
