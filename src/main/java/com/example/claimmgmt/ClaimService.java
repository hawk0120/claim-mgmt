package com.example.claimmgmt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ClaimService {

    private final ClaimRepository claimRepository;
    
    public ClaimService(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    public List<Claim> getAllClaims() {
        return claimRepository.findClaim();
    }

    public void createClaim(String description) {
        claimRepository.createClaim(description);
    }

    public void resolveClaim(long id) {
        claimRepository.resolveClaim(id);
    }
}
