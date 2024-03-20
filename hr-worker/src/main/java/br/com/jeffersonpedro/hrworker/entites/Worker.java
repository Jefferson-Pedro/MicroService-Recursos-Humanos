package br.com.jeffersonpedro.hrworker.entites;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double dailyInCome;
	
	public Worker() {
		super();
	}

	public Worker(Long id, String name, Double dailyInCome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyInCome = dailyInCome;
	}
	
	// GET E SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyInCome() {
		return dailyInCome;
	}

	public void setDailyInCome(Double dailyInCome) {
		this.dailyInCome = dailyInCome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dailyInCome, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(dailyInCome, other.dailyInCome) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	
	
}
