package gr.hua.dit.ds.restproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "application")
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	@Column
	private int id;
	
	@Column(name = "state")
	private int state;
	
	@Column(name = "criteria")
	private boolean criteria;
	
	@Column(name = "ranking")
	private int ranking;
	
	@ManyToMany(fetch=FetchType.LAZY,
                cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                          CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name = "app_instr",
		       joinColumns = @JoinColumn(name = "app_id"),
			   inverseJoinColumns = @JoinColumn(name = "instr_id"))
	private List<Instructor> committee;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "master")
	private Master master;
	
	public Application() {
		
	}

	public Application(int state, boolean criteria, Master master) {
		this.state = state;
		this.criteria = criteria;
		this.master = master;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public boolean isCriteria() {
		return criteria;
	}

	public void setCriteria(boolean criteria) {
		this.criteria = criteria;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public List<Instructor> getCommittee() {
		return committee;
	}

	public void setCommittee(List<Instructor> committee) {
		this.committee = committee;
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

	
	@Override
	public String toString() {
		return "Application [id=" + id + ", state=" + state + ", criteria=" + criteria + ", ranking=" + ranking
				+ ", committee=" + committee + ", master=" + master + "]";
	}

	//convenience method to add committee instructor
	public void addCommittee(Instructor instructor) {
		if(committee == null) {
			committee = new ArrayList<Instructor>();
		}
		committee.add(instructor);
	}
	
	

}
