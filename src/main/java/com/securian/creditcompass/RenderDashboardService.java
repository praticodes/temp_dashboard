import java.util.ArrayList;
import java.util.List;

public class RenderDashboardService {

    public List<List<Object>> findAll(List<Claim> claimList) {
        List<List<Object>> allClaimsAttributes = new ArrayList<>();

        for (Claim claim : claimList) {
            List<Object> claimAttributes = new ArrayList<>();
            // Assuming Claim class has attributes like claimId, amount, date, etc.
            claimAttributes.add(claim.getClaimId());
            claimAttributes.add(claim.getAmount());
            claimAttributes.add(claim.getDate());
            claimAttributes.add(claim.getType());
            urgency =
            claimAttributes.add(claim.getUrgency());
            claimAttributes.add(claim.getUrgency());

            allClaimsAttributes.add(claimAttributes);
        }

        return allClaimsAttributes;
    }
}
