package com.bjit.EmployeeModuleProject.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="employee_details")
public class Employee  implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer employeeId;
	@Column(unique=true,name="work_mobile")
	private String workMobile;
	@NotNull(message="Input your name!")
	@Size(min=5, max=20, message="Name must be atleast 5 character and atmost 20 character")
	@Column(name="employee_name")
	private String employeeName;
	@Column(name="work_address")
	private String workAddress;
	@Column(name="job_type")
	private String jobType;
	@Column(name="other_information")
	private String otherInformation;
	@Column(unique=true,name="work_email")
	private String workEmail;
	@Column(name="employee_image")
	private String employeeImage;
	@Column(name="work_location")
	private String workLocation;
	@Column(unique=true,name="work_phone")
	private String workPhone;
	private String department;
	@Column(name="job_title")
	private String jobTitle;
	private String manager;
	private String coach;
	private String nationality;
	@Column(name="identification_no", unique=true)
	private String identificationNo;
	@Column(name="passport_no", unique=true)
	private String passportNo;
	@Column(name="bank_ac_no", unique=true)
	private String bankAcNo;
	private String gender;
	@Column(name="home_address")
	private String homeAddress;
	@Column(name="marital_status")
	private String maritalStatus;
	@Column(name="date_of_birth")
	private java.sql.Date dateOfBirth;
	private boolean active;
	@Transient
	private MultipartFile file;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
	public String getWorkEmail() {
		return workEmail;
	}
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeImage() {
		return employeeImage;
	}
	public void setEmployeeImage(String employeeImage) {
		this.employeeImage = employeeImage;
	}
	public String getWorkMobile() {
		return workMobile;
	}
	public void setWorkMobile(String workMobile) {
		this.workMobile = workMobile;
	}
	public String getWorkaAddress() {
		return workAddress;
	}
	public void setWorkaAddress(String workAddress) {
		this.workAddress = workAddress;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIdentificationNo() {
		return identificationNo;
	}
	public void setIdentificationNo(String identificationNo) {
		this.identificationNo = identificationNo;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getBankAcNo() {
		return bankAcNo;
	}
	public void setBankAcNo(String bankAcNo) {
		this.bankAcNo = bankAcNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	public java.sql.Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}


	
	public String getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getOtherInformation() {
		return otherInformation;
	}
	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}
	
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public Employee() {
		this.employeeImage = "EMP"+UUID.randomUUID().toString().substring(26).toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", workMobile=" + workMobile + ", employeeName=" + employeeName
				+ ", workAddress=" + workAddress + ", jobType=" + jobType + ", otherInformation=" + otherInformation
				+ ", workEmail=" + workEmail + ", employeeImage=" + employeeImage + ", workLocation=" + workLocation
				+ ", workPhone=" + workPhone + ", department=" + department + ", jobTitle=" + jobTitle + ", manager="
				+ manager + ", coach=" + coach + ", nationality=" + nationality + ", identificationNo="
				+ identificationNo + ", passportNo=" + passportNo + ", bankAcNo=" + bankAcNo + ", gender=" + gender
				+ ", homeAddress=" + homeAddress + ", maritalStatus=" + maritalStatus + ", dateOfBirth=" + dateOfBirth
				+ ", active=" + active + ", file=" + file + "]";
	}	
	
	
	
	
}
