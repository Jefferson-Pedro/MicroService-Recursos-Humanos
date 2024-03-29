package br.com.jeffersonpedro.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jeffersonpedro.payroll.entites.Payment;
import br.com.jeffersonpedro.payroll.entites.Worker;
import br.com.jeffersonpedro.payroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, Integer days) { 
				
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
