package com.example.claimmgmt;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long>{

// Find Claims by Id
	@Query("SELECT * FROM Claim WHERE id = :id")
	List<Claim> findByClaimId(Long claimId);

// Find all Claims
	@Query("SELECT * FROM Claim")
	List<Claim> findAllClaims();

// Find all Unresolved Claims
	@Query("SELECT * FROM Claim WHERE resolved = false")
	List<Claim> findUnresolvedClaims();

// Resolve Claim by id
	@Query("UPDATE Claim SET resolved = true WHERE id = :id")
	void resolveClaim(Long id);

// Create Claim
	@Query("INSERT INTO Claim (description, resolved) VALUES (:description, false)")
	void createClaim(String description);

// Find all Resolved Claims
	@Query("SELECT * FROM Claim WHERE resolved = true")
	List<Claim> findResolvedClaims();

}
