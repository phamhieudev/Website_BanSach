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
@Table(name = "LOAISACH")
public class Loaisach {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LOAI")
	Integer id_Loai;

	@NotNull
	@Column(name = "TENLOAI")
	String tenLoai;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loaisach")
	private Collection<Books> books;

	public Integer getId_Loai() {
		return id_Loai;
	}

	public void setId_Loai(Integer id_Loai) {
		this.id_Loai = id_Loai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	
	
}
