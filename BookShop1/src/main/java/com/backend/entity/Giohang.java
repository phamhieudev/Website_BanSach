package com.backend.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GIOHANG")
public class Giohang {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GIO")
	Integer id_GIO;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "giohang")
	private Collection<Books> books;
	
	
	@ManyToOne
	@JoinColumn(name = "ID_KH")
	private Khachhang khachhang;
	
	public Khachhang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

	public Integer getId_GIO() {
		return id_GIO;
	}

	public void setId_GIO(Integer id_GIO) {
		this.id_GIO = id_GIO;
	}
	
	
}
