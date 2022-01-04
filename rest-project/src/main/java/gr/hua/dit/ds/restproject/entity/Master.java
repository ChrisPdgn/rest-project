package gr.hua.dit.ds.restproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master")
public class Master {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	@Column
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "context")
	private String context;
	
	@Column(name = "criteria")
	private String criteria;
	
	@Column(name = "field")
	private String field;
	
	public Master() {
		
	}

	public Master(String title, String context, String criteria, String field) {
		this.title = title;
		this.context = context;
		this.criteria = criteria;
		this.field = field;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "Master [id=" + id + ", title=" + title + ", context=" + context + ", criteria=" + criteria + ", field="
				+ field + "]";
	}
	

}
