package com.ssi.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp")
public class Emp {

	@Id
	private int id;
	private String name;
	private String address;
	private String email;
	private String phno;
	private int sal;
	
	
	
	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phno=" + phno
				+ ", sal=" + sal + "]";
	}



	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPhno() {
		return phno;
	}




	public void setPhno(String phno) {
		this.phno = phno;
	}




	public int getSal() {
		return sal;
	}




	public void setSal(int sal) {
		this.sal = sal;
	}





	
}
