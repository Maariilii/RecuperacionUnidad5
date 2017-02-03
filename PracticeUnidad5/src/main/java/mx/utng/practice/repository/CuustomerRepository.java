package mx.utng.practice.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Cuustomer;

@Repository
public interface CuustomerRepository extends JpaRepository<Cuustomer,Long> {
	
@Query("select cuustomer from Cuustomer cuustomer")
public List<Cuustomer>findAll();
}
