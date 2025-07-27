package FinalMockEmployeedetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Employee {
	private static final byte[] String=null;
	@javax.persistence.Id
	@GeneratedValue
	private int Id;
	@Column(nullable=false)
	private String EName;
	private double ESalary;
	@Column(unique = true)
	private long Ephno;
	@Lob
	private byte[] Ephoto;
	@CreationTimestamp
	private LocalDateTime ObjectcreationTime;
	@CreationTimestamp
	private LocalDate EDOB;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public double getESalary() {
		return ESalary;
	}
	public void setESalary(double eSalary) {
		ESalary = eSalary;
	}
	public long getEphno() {
		return Ephno;
	}
	public void setEphno(long ephno) {
		Ephno = ephno;
	}
	public byte[] getEphoto() {
		return Ephoto;
	}
	public void setEphoto(byte[] ephoto) {
		this.Ephoto = ephoto;
	}
	public LocalDateTime getObjectcreationTime() {
		return ObjectcreationTime;
	}
	public void setObjectcreationTime(LocalDateTime objectcreationTime) {
		ObjectcreationTime = objectcreationTime;
	}
	public LocalDate getEDOB() {
		return EDOB;
	}
	public void setEDOB(LocalDate localDate) {
		EDOB = localDate;
	}
	
	
}
