package com.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.backend.entity.Khachhang;
import com.backend.service.KhachhangService;

@CrossOrigin
@Controller
public class KhachhangController {
	
	@Autowired
	KhachhangService khachhangService;
	
	@RequestMapping(value = "/khachhangs", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Khachhang>> findAllKhachhang() {
        List<Khachhang> khachhang = khachhangService.getAllkhachhang();
        if (khachhang.isEmpty()) {
            return new ResponseEntity<List<Khachhang>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Khachhang>>(khachhang, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/khachhang/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Khachhang> getAllkhachhang(@PathVariable Integer id) {
			return khachhangService.getById(id);
		}
	 	
	 
	@RequestMapping(value = "/khachhang/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteKhachhang(@PathVariable Integer id) {
		khachhangService.deleteKhachhang(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addkhachhang", method = RequestMethod.POST)
	public HttpStatus insertKhachhang(@RequestBody Khachhang khachhang) {
		return khachhangService.addKhachhang(khachhang) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updatekhachhang", method = RequestMethod.PUT)
	public HttpStatus updateKhachhang(@RequestBody Khachhang khachhang) {
		return khachhangService.updateKhachhang(khachhang) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}

}
