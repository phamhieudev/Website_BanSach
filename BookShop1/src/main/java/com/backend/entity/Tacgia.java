package com.backend.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TACGIA")
public class Tacgia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TG")
	Integer id_TG;

	@NotNull
	@Column(name = "HOTENTG")
	String tenTG;
	
	@NotNull
	@Column(name = "SDTTG")
	String sdtTG;
	
	@NotNull
	@Column(name = "EMAILTG")
	String emailTG;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tacgia")
	private Collection<Books> books;

	public Integer getId_TG() {
		return id_TG;
	}

	public void setId_TG(Integer id_TG) {
		this.id_TG = id_TG;
	}

	public String getTenTG() {
		return tenTG;
	}

	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}

	public String getSdtTG() {
		return sdtTG;
	}

	public void setSdtTG(String sdtTG) {
		this.sdtTG = sdtTG;
	}

	public String getEmailTG() {
		return emailTG;
	}

	public void setEmailTG(String emailTG) {
		this.emailTG = emailTG;
	}

	
}
