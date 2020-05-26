package suvigya.tutorials.aws.fargate.proposal_generation_service.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import suvigya.tutorials.aws.fargate.proposal_generation_service.models.ProposalDetails;

@RestController
@RequestMapping(value = "/proposalGenration/v1")
public class ProposalGenerationController {
@RequestMapping(value="/proposalDetails", method = RequestMethod.GET)
public ProposalDetails getProposalDetails(@RequestParam("proposalId")Long proposalId) {
	ProposalDetails details = new ProposalDetails();
	if(proposalId==19880617123l) {
		details.setAccountHolderName("SUVIGYA");
		details.setAccountId(112233445566l);
		details.setAmountInvested(500000);
		details.setProductId(1735);
		details.setProductName("White Rock- Multicap");
		details.setProposalGenerationDate(new Date());
		details.setProposalId(19880617123l);
	}
	if(proposalId==198806171234l) {
		details.setAccountHolderName("NANDINI GUPTA");
		details.setAccountId(112233778894l);
		details.setAmountInvested(1000000);
		details.setProductId(1736);
		details.setProductName("AGM- Diamond- Multicap");
		details.setProposalGenerationDate(new Date());
		details.setProposalId(198806171234l);
	}
	return details;
}
}
