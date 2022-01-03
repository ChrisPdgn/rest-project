package gr.hua.dit.ds.restproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authority extends User{
	
	@Column(name = "authority")
	private String authority;
	
	public Authority() {
		
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Authority [authority=" + authority + "]";
	}
	
		
}
