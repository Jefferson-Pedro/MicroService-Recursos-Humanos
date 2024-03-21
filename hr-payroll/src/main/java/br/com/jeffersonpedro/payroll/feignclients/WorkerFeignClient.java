package br.com.jeffersonpedro.payroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.jeffersonpedro.payroll.entites.Worker;


@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping("/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id);
}
