package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="departament")
public class Departament {
	@Id @GeneratedValue
	private Long departamentId;
	private String name;
	private String budget;
	private String startDate;
	private String administrador;
	
	public Departament(String name, String butged, String startDate, String administrador) {
		super();
		this.name = name;
		this.budget = butged;
		this.startDate = startDate;
		this.administrador = administrador;
	}
	public Departament() {
		this("", "", "", "");
	}

	public Long getDepartamentId() {
		return departamentId;
	}

	public void setDepartamentId(Long departamentId) {
		this.departamentId = departamentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}
	@Override
	public String toString() {
		return "Departament [departamentId=" + departamentId + ", name=" + name + ", butget=" + budget + ", startDate="
				+ startDate + ", administrador=" + administrador + "]";
	}

	
	
	
}
