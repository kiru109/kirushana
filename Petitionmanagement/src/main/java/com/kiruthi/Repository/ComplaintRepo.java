package com.kiruthi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiruthi.model.Complaint;

@Repository
public interface ComplaintRepo extends JpaRepository<Complaint, Integer> {

}
