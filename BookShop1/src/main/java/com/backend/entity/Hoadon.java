package com.backend.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "HOADON")
public class Hoadon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HD")
	Integer id_HD;

	@ManyToOne
	@JoinColumn(name = "ID_KH")
	private Khachhang khachhang;
	
	public Khachhang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}
	
	@NotNull
	@Column(name = "TINHTRANG")
	String tinhtrang;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-dd-MM")
	@Column(name = "NGAYLAP")
	Date ngaylap;
	
	@NotNull
	@Column(name = "TONGGIA")
	Float tonggia;
	
	@NotNull
	@Column(name = "NOINHAN")
	String noinhan;
	
	@NotNull
	@Column(name = "GHICHU")
	String ghichu;

	public Integer getId_HD() {
		return id_HD;
	}

	public void setId_HD(Integer id_HD) {
		this.id_HD = id_HD;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public Date getNgaylap() {
		return ngaylap;
	}

	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}

	public Float getTonggia() {
		return tonggia;
	}

	public void setTonggia(Float tonggia) {
		this.tonggia = tonggia;
	}

	public String getNoinhan() {
		return noinhan;
	}

	public void setNoinhan(String noinhan) {
		this.noinhan = noinhan;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	
//	 @OneToOne(mappedBy = "hoadon")
//	  private Chitiethoadon chitiethoadon;

	
	
}
