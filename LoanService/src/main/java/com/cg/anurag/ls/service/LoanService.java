package com.cg.anurag.ls.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.anurag.ls.dao.LoanDAO;
import com.cg.anurag.ls.dto.Loan;
@Service
public class LoanService 
{
	@Autowired
	LoanDAO ldao;
	public void setLdao(LoanDAO ldao) { this.ldao=ldao; }
	@Transactional(readOnly=true)
	public Optional<Loan> getLoanRequest(Integer loanId)
	{
		return ldao.findById(loanId);
	}
	@Transactional(readOnly=true)
	public List<Loan> getLoanRequests()
	{
		return ldao.findAll();
	}
	@Transactional(readOnly=true)
	public Loan createLoanRequest(Loan loan)
	{
		return ldao.save(loan);
	}
	@Transactional(readOnly=true)
	public Optional<Loan> getLoanDisbursed(Integer loanId)
	{
		return ldao.findById(loanId);
	}
	@Transactional(readOnly=true)
	public List<Loan> getAllLoanDisbursed()
	{
		return ldao.findAll();
	}
	public String acceptLoanRequest(Loan newLoan)
	{
		Loan loan = ldao.findById(newLoan.getLoanId()).get();
		if(loan!=null)
			
			return "Loan Accepted";
		return "Loan Rejected";
	}
 
}
