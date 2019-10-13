package com.backend.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entity.Nhanvien;
import com.backend.service.NhanvienService;


@RestController
@CrossOrigin("http://localhost:8080")
public class NhanvienController {

	@Autowired
	NhanvienService nhanvienService;
	
	@RequestMapping(value = "/nhanviens", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Nhanvien>> findAllNhanvien() {
        List<Nhanvien> nhanviens = nhanvienService.getAllNV();
        if (nhanviens.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(nhanviens, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/nhanvien/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Nhanvien> getAllnhanvienn(@PathVariable Integer id) {
			return nhanvienService.getById(id);
		}
	 
	//@RequestMapping(value = "/workByName/{name}", method = RequestMethod.GET,
   	//	 produces = MediaType.APPLICATION_JSON_VALUE)
	//public List<Work> getWorkByName(@PathVariable String name) {
	//	return workService.findByName(name);
	//}
	
	
	
	// @RequestMapping(value = "/searchByContain/{name}", method =
	// RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) public
	// List<Work> searchByContainWork(@PathVariable String name) { return
	 //workService.findByNameContainingWorks(name); }
	 
	
	@RequestMapping(value = "/nhanvien/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteNhanvien(@PathVariable Integer id) {
		nhanvienService.deleteNhanvien(id);
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addnhanvien", method = RequestMethod.POST)
	public HttpStatus insertNhanvien(@RequestBody Nhanvien nhanvien) {
		return nhanvienService.addNhanvien(nhanvien) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updatenhanvien", method = RequestMethod.PUT)
	public HttpStatus updateNhanvien(@RequestBody Nhanvien nhanvien) {
		return nhanvienService.updateNhanvien(nhanvien) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
}

