package gr.hua.dit.ds.restproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "secretary")
public class Secretary extends User{
	
	//one directional 
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private List<Application> app_pending;
	
	//one directional 
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	private List<Application> app_complete;
	
	public Secretary(){
		
	}

	public Secretary(List<Application> app_pending, List<Application> app_complete) {
		this.app_pending = app_pending;
		this.app_complete = app_complete;
	}

	public List<Application> getApp_pending() {
		return app_pending;
	}

	public void setApp_pending(List<Application> app_pending) {
		this.app_pending = app_pending;
	}

	public List<Application> getApp_complete() {
		return app_complete;
	}

	public void setApp_complete(List<Application> app_complete) {
		this.app_complete = app_complete;
	}

	@Override
	public String toString() {
		return "Secretary [app_pending=" + app_pending + ", app_complete=" + app_complete + "]";
	}
	
	//convenience method to add pending application
	public void addPendingApp(Application app) {
		if(app_pending == null) {
			app_pending = new ArrayList<>();
	    }
	    app_pending.add(app);
	}
	
	//convenience method to add completed application
		public void addCompletedApp(Application app) {
			if(app_complete == null) {
				app_complete = new ArrayList<>();
		    }
			app_complete.add(app);
		}

}
