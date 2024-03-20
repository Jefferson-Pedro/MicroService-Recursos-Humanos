package br.com.jeffersonpedro.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jeffersonpedro.hrworker.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
