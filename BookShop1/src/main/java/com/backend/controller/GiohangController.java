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

import com.backend.entity.Giohang;
import com.backend.service.GiohangService;

@CrossOrigin
@Controller
public class GiohangController {

	@Autowired
	GiohangService giohangService;
	
	@RequestMapping(value = "/giohangs", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Giohang>> findAllGiohang() {
        List<Giohang> giohang = giohangService.getAllgiohang();
        if (giohang.isEmpty()) {
            return new ResponseEntity<List<Giohang>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Giohang>>(giohang, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/giohang/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Giohang> getAllgiohang(@PathVariable Integer id) {
			return giohangService.getById(id);
		}
	 	
	@RequestMapping(value = "/giohang/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteGiohang(@PathVariable Integer id) {
		giohangService.deleteGiohang(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addgiohang", method = RequestMethod.POST)
	public HttpStatus insertGiohang(@RequestBody Giohang giohang) {
		return giohangService.addGiohang(giohang) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updategiohang", method = RequestMethod.PUT)
	public HttpStatus updateGiohang(@RequestBody Giohang giohang) {
		return giohangService.updateGiohang(giohang) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
