package br.com.hr_payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hr_payroll.entities.Payment;
import br.com.hr_payroll.entities.Worker;
import br.com.hr_payroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	/*
	 * @Value("${hr-worker.host}") private String workerHost;
	 */
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, Integer days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
