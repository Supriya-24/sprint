package com.cg.anurag.ls.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.anurag.ls.dto.Loan;
import com.cg.anurag.ls.service.LoanService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoanController 
{
	@Autowired
	LoanService loanService; 
	public void setLoanService(LoanService loanService)
	{
		this.loanService=loanService;
	}
	
   @GetMapping("/getLoanRequest/{loanId}")
   public Loan getLoanRequest(@PathVariable int loanId)
   {
	   return loanService.getLoanRequest(loanId);
   }
   
   @GetMapping("/getLoanRequests")
   public List<Loan> getLoanRequests()
   {
	   return loanService.getLoanRequests();
   }
      
   @GetMapping("/getLoanDisbursed/{loanId}")
   public Loan getLoanDisbursed(@PathVariable int loanId)
   {
	   return loanService.getLoanDisbursed(loanId);
   }
   
   @GetMapping("/getAllLoanDisbursed")
   public List<Loan> getAllLoanDisbursed()
   {
	   return loanService.getAllLoanDisbursed();
   }
   @PostMapping("/createLoanRequest/{loanId}/{accId}/{amount}/{type}/{tenure}/{roi}/{emi}/{status}")
   public String createLoanRequest(@PathVariable("loan_id")int loanId,@PathVariable("acc_id")int accId,@PathVariable int amount,@PathVariable("type")int type,
		   @PathVariable int tenure,@PathVariable int roi,@PathVariable int emi,@PathVariable int status)
   {
	return loanService.createLoanRequest(loanId,accId,amount,type,tenure,roi,emi,status);
	  
   }

}
