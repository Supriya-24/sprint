package com.cg.anurag.ls.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.anurag.ls.dao.LoanDAO;
import com.cg.anurag.ls.dao.LoanRepaymentDAO;
import com.cg.anurag.ls.dao.SanctionedLoansDAO;
import com.cg.anurag.ls.dto.LoanRepayment;
import com.cg.anurag.ls.dto.SanctionedLoans;
@Service
public class LoanService
{
	@Autowired
	LoanDAO ldao;
	SanctionedLoansDAO sdao;
	LoanRepaymentDAO lrdao;
	public void setLdao(LoanDAO ldao) { this.ldao=ldao; }
	public void setSdao(SanctionedLoansDAO sdao) { this.sdao=sdao; }
	public void setLrdao(LoanRepaymentDAO lrdao) { this.lrdao=lrdao; }
	@Transactional(readOnly=true)
	public Optional<SanctionedLoans> getSanctionedLoan(Integer loanId)
	{
		return sdao.findById(loanId);
	}
	@Transactional(readOnly=true)
	public List<SanctionedLoans> getAllSanctionedLoans()
	{
		return sdao.findAll();
	}
	@Transactional(readOnly=true)
	public Optional<LoanRepayment> getLoanRepayment(Integer custId)
	{
		return lrdao.findById(custId);
	}
	@Transactional(readOnly=true)
	public List<LoanRepayment> getAllLoanRepayments()
	{
		return lrdao.findAll();
	}
	
}
