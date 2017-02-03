package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Departament;

public interface DepartamentRepository extends JpaRepository<Departament, Long> {
	@Query("select dep from Departament dep")
	public List<Departament> findAll();
}
