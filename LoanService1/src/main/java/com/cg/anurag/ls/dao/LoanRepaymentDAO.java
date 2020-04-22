package com.cg.anurag.ls.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.anurag.ls.dto.LoanRepayment;
public interface LoanRepaymentDAO extends JpaRepository<LoanRepayment,Integer>
{

}
