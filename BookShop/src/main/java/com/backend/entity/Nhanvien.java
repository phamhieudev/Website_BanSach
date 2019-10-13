package com.backend.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "NHANVIEN")
public class Nhanvien implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_NV")
	Integer id_NV;

	@NotNull
	@Column(name = "HOTEN_NV")
	String hotenNV;
	
	@NotNull
	@Column(name = "SDT_NV")
	String sdtNV;
	
	@NotNull
	@Column(name = "EMAIL_NV")
	String emailNV;
	
	@NotNull
	@Column(name = "DIACHI_NV")
	String diachiNV;

	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-dd-MM")
	@Column(name = "NGAYSINH_NV")
	Date ngaysinhNV;
	
	@NotNull
	@Column(name = "GIOITINH_NV")
	String gioitinhNV;
	
	@NotNull
	@Column(name = "TENDANGNHAP")
	String tendangnhap;
	
	@NotNull
	@Column(name = "PASSWORD")
	String password;
	

	@Column(name = "CHUCVU")
	String chucvu;


	public Integer getId_NV() {
		return id_NV;
	}


	public void setId_NV(Integer id_NV) {
		this.id_NV = id_NV;
	}


	public String getHotenNV() {
		return hotenNV;
	}


	public void setHotenNV(String hotenNV) {
		this.hotenNV = hotenNV;
	}


	public String getSdtNV() {
		return sdtNV;
	}


	public void setSdtNV(String sdtNV) {
		this.sdtNV = sdtNV;
	}


	public String getEmailNV() {
		return emailNV;
	}


	public void setEmailNV(String emailNV) {
		this.emailNV = emailNV;
	}


	public String getDiachiNV() {
		return diachiNV;
	}


	public void setDiachiNV(String diachiNV) {
		this.diachiNV = diachiNV;
	}


	public Date getNgaysinhNV() {
		return ngaysinhNV;
	}


	public void setNgaysinhNV(Date ngaysinhNV) {
		this.ngaysinhNV = ngaysinhNV;
	}


	public String getGioitinhNV() {
		return gioitinhNV;
	}


	public void setGioitinhNV(String gioitinhNV) {
		this.gioitinhNV = gioitinhNV;
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


	public String getChucvu() {
		return chucvu;
	}


	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	
	
	
}


