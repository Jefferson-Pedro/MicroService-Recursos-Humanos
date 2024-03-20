package br.com.jeffersonpedro.payroll.services;

import org.springframework.stereotype.Service;

import br.com.jeffersonpedro.payroll.entites.Payment;

@Service
public class PaymentService {
	
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
