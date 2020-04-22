package com.cg.anurag.ls.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.anurag.ls.dto.SanctionedLoans;
public interface SanctionedLoansDAO extends JpaRepository<SanctionedLoans,Integer>
{

}
