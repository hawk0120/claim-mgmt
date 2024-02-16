package com.example.claimmgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    private final ClaimService claimService;

    @Autowired
    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @GetMapping
    public List<Claim> getAllClaims() {
      return claimService.getAllClaims();
    }

/**    @PostMapping
    public Claim createClaim(@RequestBody String description) {
	return claimService.createClaim(description);
    }
    @PostMapping("/{id}/resolve")
    public String resolveClaim(@PathVariable Long id) {
        if (claimService.resolveClaim(id)) {
            return "Claim resolved successfully.";
        } else {
            return "Claim not found or already resolved.";
        }
    }
**/

}
