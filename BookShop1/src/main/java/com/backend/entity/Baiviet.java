package com.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BAIVIET")
public class Baiviet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BAIVIET")
	Integer id_Baiviet;

	@NotNull
	@Column(name = "TENBAIVIET")
	String tenBaiviet;
	
	@NotNull
	@Column(name = "NOIDUNG")
	String noidung;
	
	@ManyToOne
	@JoinColumn(name = "ID_NV")
	private Baiviet baiviet;

	public Baiviet getBaiviet() {
		return baiviet;
	}

	public void setBaivietr(Baiviet baiviet) {
		this.baiviet = baiviet;
	}

	public Integer getId_Baiviet() {
		return id_Baiviet;
	}

	public void setId_Baiviet(Integer id_Baiviet) {
		this.id_Baiviet = id_Baiviet;
	}

	public String getTenBaiviet() {
		return tenBaiviet;
	}

	public void setTenBaiviet(String tenBaiviet) {
		this.tenBaiviet = tenBaiviet;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	
	
}
