package com.pecunia.bs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pecunia.bs.dto.Loans;
public interface LoansDAO extends JpaRepository<Loans,Integer>
{

}
