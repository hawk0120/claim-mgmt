package com.example.claimmgmt;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClaimRepository extends CrudRepository<Claim, Long>{

	// Write Custom Query methods
	
	@Query("SELECT * FROM Claim")
	List<Claim> findAllClaims();
	
	

}
