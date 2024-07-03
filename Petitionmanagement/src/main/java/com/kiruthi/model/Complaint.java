package com.kiruthi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "complaint")
public class Complaint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String complaintname;
	@Column
	private String deprt;
	@OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Complaint() {
		super();
		
	}

	public Complaint(int id, String complaintname, String deprt) {
		super();
		this.id = id;
		this.complaintname = complaintname;
		this.deprt = deprt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComplaintname() {
		return complaintname;
	}

	public void setComplaintname(String complaintname) {
		this.complaintname = complaintname;
	}

	public String getDeprt() {
		return deprt;
	}

	public void setDeprt(String deprt) {
		this.deprt = deprt;
	}

	@Override
	public String toString() {
		return "Complaint [id=" + id + ", complaintname=" + complaintname + ", deprt=" + deprt + "]";
	}

}
