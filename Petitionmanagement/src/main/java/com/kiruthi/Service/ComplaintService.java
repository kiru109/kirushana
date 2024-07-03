package com.kiruthi.Service;

import java.util.List;

import com.kiruthi.model.Complaint;

public interface ComplaintService {
	public void addComplaint(Complaint complaint);

	public Complaint getComplaint(int id);

	public List<Complaint> getAllComplaint();

	void updateComplaint(Complaint complaint);

	public void deleteComplaint(int id);
}
