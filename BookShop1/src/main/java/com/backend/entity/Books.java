package com.backend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "SACH")
public class Books {

	@Id
	@Column(name = "ID_SACH")
	Integer id_SACH;
////////////////
	@ManyToOne
	@JoinColumn(name = "ID_LOAI")
	private Loaisach loaisach;
	
	public Loaisach getLoaisach() {
		return loaisach;
	}

	public void setLoaisach(Loaisach loaisach) {
		this.loaisach = loaisach;
	}
////////////////
	@ManyToOne
	@JoinColumn(name = "ID_NXB")
	private Nhaxuatban nhaxuatban;

	public Nhaxuatban getNhaxuatban() {
		return nhaxuatban;
	}

	public void setPublisher(Nhaxuatban nhaxuatban) {
		this.nhaxuatban = nhaxuatban;
	}
////////////////////
	@NotNull
	@Column(name = "TENSACH")
	String tenS;
	
	@NotNull
	@Column(name = "TOMLUOCNOIDUNG")
	String tomLuocNoiDung;
	
	@NotNull
	@Column(name = "SOTRANG")
	Integer soTrang;
	
	@NotNull
	@Column(name = "NGONNGU")
	String ngonNgu;
	
	@NotNull
	@Column(name = "PHIENBAN")
	Integer phienBan;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "NAMXUATBAN")
	Date namXuatBan;
	

	@NotNull
	@Column(name = "DONGIA")
	Float donGia;
	
	@Column(name = "HINHANH")
	String hinhAnh;
	
	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	@NotNull
	@Column(name = "TRANGTHAI")
	String trangThai;
///////////////////
	@ManyToOne
	@JoinColumn(name = "ID_TG")
	private Tacgia tacgia;

	public Tacgia getTacgia() {
		return tacgia;
	}

	public void setTacgia(Tacgia tacgia) {
		this.tacgia = tacgia;
	}
////////////////////////
	@ManyToOne
	@JoinColumn(name = "ID_SACH",insertable = false, updatable = false)
	private Giohang giohang;
	
	public Giohang getGiohang() {
		return giohang;
	}
	
	public void setGiohang(Giohang giohang) {
		this.giohang = giohang;
	}
	
//	@ManyToOne
//	@JoinColumn(name = "ID_SACH")
//	private Chitiethoadon chitiethoadon;
//
//	public Chitiethoadon getChitiethoadon() {
//		return chitiethoadon;
//	}
//
//	public void setChitiethoadon(Chitiethoadon chitiethoadon) {
//		this.chitiethoadon = chitiethoadon;
//	}
 ///////////////////
	public Integer getId_SACH() {
		return id_SACH;
	}

	public void setId_SACH(Integer id_SACH) {
		this.id_SACH = id_SACH;
	}

	public String getTenS() {
		return tenS;
	}

	public void setTenS(String tenS) {
		this.tenS = tenS;
	}

	public String getTomLuocNoiDung() {
		return tomLuocNoiDung;
	}

	public void setTomLuocNoiDung(String tomLuocNoiDung) {
		this.tomLuocNoiDung = tomLuocNoiDung;
	}

	public Integer getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(Integer soTrang) {
		this.soTrang = soTrang;
	}

	public String getNgonNgu() {
		return ngonNgu;
	}

	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public Integer getPhienBan() {
		return phienBan;
	}

	public void setPhienBan(Integer phienBan) {
		this.phienBan = phienBan;
	}

	public Date getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(Date namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public Float getDonGia() {
		return donGia;
	}

	public void setDonGia(Float donGia) {
		this.donGia = donGia;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
}
