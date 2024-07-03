package com.kiruthi.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiruthi.Repository.ComplaintRepo;
import com.kiruthi.Service.ComplaintService;
import com.kiruthi.model.Complaint;

@Service
public class ComplaintServiceImpl implements ComplaintService {
	@Autowired
	ComplaintRepo repo;

	@Override
	public void addComplaint(Complaint complaint) {
		repo.save(complaint);
	}

	@Override
	public Complaint getComplaint(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Complaint> getAllComplaint() {
		return repo.findAll();
	}

	@Override
	public void updateComplaint(Complaint complaint) {

		repo.save(complaint);
	}

	public void deleteComplaint(int id) {
		repo.deleteById(id);
	}
}
