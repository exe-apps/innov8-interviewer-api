package com.ibm.apps.internal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interviewer")
public class Interviewer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long interviewerId;
	
	private String name;
	
	private String contactNumber;
	
	private boolean isCvReviewer;
	
	private boolean isTechInterviewer;
	
	private String daysAvailable;
	
	private String timeAvailable;
	
	private String webexUrl;
	
	private String imageUrl;
	
	public Long getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(Long interviewerId) {
		this.interviewerId = interviewerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public boolean isCvReviewer() {
		return isCvReviewer;
	}
	public void setCvReviewer(boolean isCvReviewer) {
		this.isCvReviewer = isCvReviewer;
	}
	public boolean isTechInterviewer() {
		return isTechInterviewer;
	}
	public void setTechInterviewer(boolean isTechInterviewer) {
		this.isTechInterviewer = isTechInterviewer;
	}
	public String getDaysAvailable() {
		return daysAvailable;
	}
	public void setDaysAvailable(String daysAvailable) {
		this.daysAvailable = daysAvailable;
	}
	public String getTimeAvailable() {
		return timeAvailable;
	}
	public void setTimeAvailable(String timeAvailable) {
		this.timeAvailable = timeAvailable;
	}
	public String getWebexUrl() {
		return webexUrl;
	}
	public void setWebexUrl(String webexUrl) {
		this.webexUrl = webexUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
