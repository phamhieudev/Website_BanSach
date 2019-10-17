package com.backend.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CHITIET_HD")
public class Chitiethoadon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CTHD")
	Integer id_CTHD;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_HD", referencedColumnName = "id_HD")
    private Hoadon hoadon;

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chitiethoadon")
//	private Collection<Books> books;
	
	@NotNull
	@Column(name = "SOLUONG")
	Integer soluong;
	
	@NotNull
	@Column(name = "DONGIA")
	Float dongia;

	public Integer getId_CTHD() {
		return id_CTHD;
	}

	public void setId_CTHD(Integer id_CTHD) {
		this.id_CTHD = id_CTHD;
	}

	public Integer getSoluong() {
		return soluong;
	}

	public void setSoluong(Integer soluong) {
		this.soluong = soluong;
	}

	public Float getDongia() {
		return dongia;
	}

	public void setDongia(Float dongia) {
		this.dongia = dongia;
	}
	
	
}
