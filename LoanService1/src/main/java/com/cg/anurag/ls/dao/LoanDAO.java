package com.cg.anurag.ls.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.anurag.ls.dto.Loan;
@Repository
public interface LoanDAO extends JpaRepository<Loan,Integer>
{

}
