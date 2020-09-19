package vega2k.boot.jparelation.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
	
	@Id
	@Column(name="seq")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int seq;
	
	@Column(name="member_id")
	private long memberId;
	
	@Column(name="no")
	private String no;
		
	public Phone() {}
	
	public Phone(String no){
		this.no = no;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		String result = "[phone_"+seq+"] " + no;
		return result;
	}
}