package com.kiruthi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiruthi.ServiceImpl.ComplaintServiceImpl;
import com.kiruthi.model.Complaint;

@RestController
@RequestMapping("/Complaint")
@CrossOrigin("*")

public class ComplaintController {

	@Autowired
	ComplaintServiceImpl service;

	@PostMapping
	public String insertComplaint(@RequestBody Complaint petition) {
		String msg = "";
		try {
			service.addComplaint(petition);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Complaint getComplaintById(@PathVariable("id") int id) {
		return service.getComplaint(id);
	}

	@GetMapping("/all")
	public List<Complaint> getComplaint() {
		return service.getAllComplaint();
	}

	@PutMapping
	public String updateComplaint(@RequestBody Complaint petition) {
		String msg = "";
		try {
			service.updateComplaint(petition);
			msg = "Success";
		} catch (Exception s) {
			s.printStackTrace();
			msg = "failure";
		}
		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteComplaint(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteComplaint(id);
			msg = "Success";
		} catch (Exception s) {
			s.printStackTrace();
			msg = "failure";
		}
		return msg;
	}
}
