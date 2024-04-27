package com.ssi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssi.Entity.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer> {
	

}
