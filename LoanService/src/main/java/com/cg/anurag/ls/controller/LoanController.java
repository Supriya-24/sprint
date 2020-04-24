package com.cg.anurag.ls.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
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
	
   @GetMapping(value="/getLoanRequest/{loanId}",produces="application/json")
   public ResponseEntity<Optional<Loan>> getLoanRequest(@PathVariable int loanId)
   {
	   Optional<Loan> loan = loanService.getLoanRequest(loanId);
	   if(loan.isPresent())
	 		  return new ResponseEntity<Optional<Loan>>(loan,HttpStatus.OK);
	 	  return new ResponseEntity<Optional<Loan>>(loan,HttpStatus.NOT_FOUND);
   }
   
   @GetMapping(value="/getLoanRequests",produces="application/json")
   public List<Loan> getLoanRequests()
   {
	   return loanService.getLoanRequests();
   }
 
   @GetMapping(value="/getLoanDisbursed/{loanId}",produces="application/json")
   public ResponseEntity<Optional<Loan>> getLoanDisbursed(@PathVariable int loanId)
   {
	   Optional<Loan> loan = loanService.getLoanDisbursed(loanId);
	   if(loan.isPresent())
	 		  return new ResponseEntity<Optional<Loan>>(loan,HttpStatus.OK);
	 	  return new ResponseEntity<Optional<Loan>>(loan,HttpStatus.NOT_FOUND);
   }
   
   @GetMapping(value="/getAllLoanDisbursed",produces="application/json")
   public List<Loan> getAllLoanDisbursed()
   {
	   return loanService.getAllLoanDisbursed();
   }
   
   @PostMapping(value="/createLoanRequest",consumes="application/json")
   public ResponseEntity<String> createLoanRequest(@RequestBody() Loan loan)
   {
 	  try
 	  {
 	      loanService.createLoanRequest(loan);
 	      return new ResponseEntity<String>("created loan request",HttpStatus.OK);
 	  }
 	  catch(Exception ex)
 	  {
 	    	return new ResponseEntity<String>(ex.getMessage()+" creation Failed",HttpStatus.BAD_REQUEST);
 	  } 
   }
  /* @PostMapping("/createLoanRequest/{loanId}/{accId}/{amount}/{type}/{tenure}/{roi}/{emi}/{status}")
   public String createLoanRequest(@PathVariable("loan_id")int loanId,@PathVariable("acc_id")int accId,@PathVariable int amount,@PathVariable("type")int type,
		   @PathVariable int tenure,@PathVariable int roi,@PathVariable int emi,@PathVariable int status)
   {
	return loanService.createLoanRequest(loanId,accId,amount,type,tenure,roi,emi,status);
	  
   }*/

}
