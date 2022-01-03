package gr.hua.dit.ds.restproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor extends User{
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "field")
	private String field;
	
	@ManyToMany(fetch=FetchType.LAZY,
            	cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            			  CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name = "app_instr",
    		   joinColumns = @JoinColumn(name = "instr_id"),
    		   inverseJoinColumns = @JoinColumn(name = "app_id"))
	private List<Application> applications;
	
	public Instructor() {
		
	}

	public Instructor(String firstname, String lastname, String email, String field) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.field = field;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "Instructor [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", field=" + field + ", applications=" + applications + "]";
	}
	
	//convenience method for adding an application
	public void addApplication(Application app) {
        if (applications == null) {
                applications = new ArrayList<>();
        }
        applications.add(app);
	}
	
	
}
