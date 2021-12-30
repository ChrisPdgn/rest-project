package gr.hua.dit.ds.restproject.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authority {

	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	private User user;
	
	@Column(name = "authority")
	private String authority;
	
	public Authority() {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Authority [user=" + user + ", authority=" + authority + "]";
	}
	
		
}
