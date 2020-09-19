package vega2k.boot.jparelation.member;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Member {
	
	@Id
	@Column(name="seq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL) // (1)
	@JoinColumn(name="member_id")
	private Collection<Phone> phone;

	public Member(){}
	
	public Member(String name){
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Collection<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	
	public void addPhone(Phone p){
		if( phone == null ){
			phone = new ArrayList<Phone>();
		}
		phone.add(p);
	}
	
	@Override
	public String toString() {
		String result = "["+id+"] " + name;
		for( Phone p : phone ){
			result += "\n" + p.toString();
		}
		return result;
	}
}