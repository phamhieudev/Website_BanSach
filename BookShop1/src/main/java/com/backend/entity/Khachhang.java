package com.backend.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "KHACHHANG")
public class Khachhang {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_KH")
	Integer id_KH;

	@NotNull
	@Column(name = "TEN_KH")
	String tenKH;
	
	@NotNull
	@Column(name = "SDT_KH")
	String sdtKH;
	
	@NotNull
	@Column(name = "EMAIL_KH")
	String emailKH;
	
	@NotNull
	@Column(name = "DIACHI_KH")
	String diachiKH;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-dd-MM")
	@Column(name = "NGAYSINH_KH")
	Date ngaysinhKH;
	
	@NotNull
	@Column(name = "GIOITINH_KH")
	String gioitinhKH;
	
	@NotNull
	@Column(name = "TENDANGNHAP")
	String tendangnhap;
	
	@NotNull
	@Column(name = "PASSWORD")
	String password;

	public Integer getId_KH() {
		return id_KH;
	}

	public void setId_KH(Integer id_KH) {
		this.id_KH = id_KH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getSdtKH() {
		return sdtKH;
	}

	public void setSdtKH(String sdtKH) {
		this.sdtKH = sdtKH;
	}

	public String getEmailKH() {
		return emailKH;
	}

	public void setEmailKH(String emailKH) {
		this.emailKH = emailKH;
	}

	public String getDiachiKH() {
		return diachiKH;
	}

	public void setDiachiKH(String diachiKH) {
		this.diachiKH = diachiKH;
	}

	public Date getNgaysinhKH() {
		return ngaysinhKH;
	}

	public void setNgaysinhKH(Date ngaysinhKH) {
		this.ngaysinhKH = ngaysinhKH;
	}

	public String getGioitinhKH() {
		return gioitinhKH;
	}

	public void setGioitinhKH(String gioitinhKH) {
		this.gioitinhKH = gioitinhKH;
	}

	public String getTendangnhap() {
		return tendangnhap;
	}

	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khachhang")
	private Collection<Hoadon> hoadon;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "khachhang")
	private Collection<Giohang> giohang;
	
	
}
