package br.com.hr_worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hr_worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
