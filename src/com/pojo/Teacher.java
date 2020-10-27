package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher {

	@Id
	@GeneratedValue
	@Column(name="tid")
	private int tid;
	@Column(name="tfname")
	private String tfname;
	@Column(name="tlname")
	private String tlname;
	@Column(name="temail")
	private String temail;
	@Column(name="tgender")
	private String tgender;
	@Column(name="tphone")
	private String tphone;
	@Column(name="taddress")
	private String taddress;
	@Column(name="tdateofbirth")
	private String tdateofbirth;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="Department")
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTfname() {
		return tfname;
	}
	public void setTfname(String tfname) {
		this.tfname = tfname;
	}
	public String getTlname() {
		return tlname;
	}
	public void setTlname(String tlname) {
		this.tlname = tlname;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public String getTgender() {
		return tgender;
	}
	public void setTgender(String tgender) {
		this.tgender = tgender;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
	}
	public String getTaddress() {
		return taddress;
	}
	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}
	public String getTdateofbirth() {
		return tdateofbirth;
	}
	public void setTdateofbirth(String tdateofbirth) {
		this.tdateofbirth = tdateofbirth;
	}
	
	
	
}
