package com.cg.anurag.ls.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cg.anurag.ls.dto.LoanRepayment;
import com.cg.anurag.ls.dto.SanctionedLoans;
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
	
   @GetMapping(value="/getSanctionedLoan/{loanId}",produces="application/json")
   public ResponseEntity<Optional<SanctionedLoans>> getSanctionedLoan(@PathVariable int loanId)
   {
	   Optional<SanctionedLoans> sloan = loanService.getSanctionedLoan(loanId);
	   if(sloan.isPresent())
	 		  return new ResponseEntity<Optional<SanctionedLoans>>(sloan,HttpStatus.OK);
	 	  return new ResponseEntity<Optional<SanctionedLoans>>(sloan,HttpStatus.NOT_FOUND);
   }
   
   @GetMapping(value="/getAllSanctionedLoans",produces="application/json")
   public List<SanctionedLoans> getAllSanctionedLoans()
   {
	   return loanService.getAllSanctionedLoans();
   }
   @GetMapping(value="/getLoanRepayment/{custId}",produces="application/json")
   public ResponseEntity<Optional<LoanRepayment>> getLoanRepayment(@PathVariable int custId)
   {
	   Optional<LoanRepayment> lrloan = loanService.getLoanRepayment(custId);
	   if(lrloan.isPresent())
	 		  return new ResponseEntity<Optional<LoanRepayment>>(lrloan,HttpStatus.OK);
	 	  return new ResponseEntity<Optional<LoanRepayment>>(lrloan,HttpStatus.NOT_FOUND);
   }
   
   @GetMapping(value="/getAllLoanRepayments",produces="application/json")
   public List<LoanRepayment> getAllLoanRepayments()
   {
	   return loanService.getAllLoanRepayments();
   }
   
}
