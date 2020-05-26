package suvigya.tutorials.aws.fargate.proposal_generation_service.models;

import java.io.Serializable;
import java.util.Date;

public class ProposalDetails implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = 1482540416359870732L;
private long proposalId;
private long productId;
//to be replaced with product class
private String productName;
private long accountId;
private String accountHolderName;
private double amountInvested;
public long getProposalId() {
	return proposalId;
}
public void setProposalId(long proposalId) {
	this.proposalId = proposalId;
}
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public long getAccountId() {
	return accountId;
}
public void setAccountId(long accountId) {
	this.accountId = accountId;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getAmountInvested() {
	return amountInvested;
}
public void setAmountInvested(double amountInvested) {
	this.amountInvested = amountInvested;
}
public Date getProposalGenerationDate() {
	return proposalGenerationDate;
}
public void setProposalGenerationDate(Date proposalGenerationDate) {
	this.proposalGenerationDate = proposalGenerationDate;
}
private Date proposalGenerationDate; 


}
