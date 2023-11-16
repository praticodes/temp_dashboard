package com.securian.creditcompass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DashboardController {

    private final ClaimRepository claimRepository; // Assuming you have a repository for Claims

    @GetMapping("/api/claims") // API endpoint to get all claims
    public List<List> getAllClaims() {
        return claimRepository.findAll();
    }

    // Other API endpoints for CRUD operations, filtering, etc.
}
