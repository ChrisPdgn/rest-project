package gr.hua.dit.ds.restproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	private User user;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "degree_title")
	private String degreeTitle;
	
	@Column(name = "degree_grade")
	private float degreeGrade;
	
	@Column(name = "preference")
	private String preference; //?????????????????????
	
	@Column(name = "recommendation")
	private String recommendation;
	
	//one directional 
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Application> applications;
	
	public Student() {
		
	}

	public Student(User user, String firstname, String lastname, String email, String degreeTitle, float degreeGrade,
			String preference, String recommendation) {
		this.user = user;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.degreeTitle = degreeTitle;
		this.degreeGrade = degreeGrade;
		this.preference = preference;
		this.recommendation = recommendation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	public float getDegreeGrade() {
		return degreeGrade;
	}

	public void setDegreeGrade(float degreeGrade) {
		this.degreeGrade = degreeGrade;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "Student [user=" + user + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", degreeTitle=" + degreeTitle + ", degreeGrade=" + degreeGrade + ", preference=" + preference
				+ ", recommendation=" + recommendation + ", applications=" + applications + "]";
	}
	
	//convenience method to add application
	public void add(Application app) {
        if(applications == null) {
                applications = new ArrayList<>();
        }
        applications.add(app);
	}
	
}
