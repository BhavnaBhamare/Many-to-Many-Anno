package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="sid")
	private int sid;
	@Column(name="sfname")
	private String sfname;
	@Column(name="sfaname")
	private String sfaname;
	@Column(name="smname")
	private String smname;
	@Column(name="slname")
	private String slname;
	@Column(name="semail")
	private String semail;
	@Column(name="sgender")
	private String sgender;
	@Column(name="sphone")
	private String sphone;
	@Column(name="saddress")
	private String saddress;
	@Column(name="sdateofbirth")
	private String sdateofbirth;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="Department")
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getSfaname() {
		return sfaname;
	}
	public void setSfaname(String sfaname) {
		this.sfaname = sfaname;
	}
	public String getSmname() {
		return smname;
	}
	public void setSmname(String smname) {
		this.smname = smname;
	}
	public String getSlname() {
		return slname;
	}
	public void setSlname(String slname) {
		this.slname = slname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getSdateofbirth() {
		return sdateofbirth;
	}
	public void setSdateofbirth(String sdateofbirth) {
		this.sdateofbirth = sdateofbirth;
	}
	
	
	
	
	
}
