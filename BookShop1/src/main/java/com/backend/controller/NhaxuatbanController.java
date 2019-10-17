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

import com.backend.entity.Nhaxuatban;
import com.backend.service.NhaxuatbanService;

@CrossOrigin
@Controller
public class NhaxuatbanController {

	
	@Autowired
	NhaxuatbanService nhaxuatbanService;
	
	@RequestMapping(value = "/nhaxuatbans", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Nhaxuatban>> findAllNhaxuatban() {
        List<Nhaxuatban> nhaxuatban = nhaxuatbanService.getAllnhaxuatban();
        if (nhaxuatban.isEmpty()) {
            return new ResponseEntity<List<Nhaxuatban>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Nhaxuatban>>(nhaxuatban, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/nhaxuatban/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Nhaxuatban> getAllnhaxuatban(@PathVariable Integer id) {
			return nhaxuatbanService.getById(id);
		}
	 
	
	@RequestMapping(value = "/nhaxuatban/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteNhaxuatban(@PathVariable Integer id) {
		nhaxuatbanService.deleteNhaxuatban(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addnhaxuatban", method = RequestMethod.POST)
	public HttpStatus insertNhaxuatban(@RequestBody Nhaxuatban nhaxuatban) {
		return nhaxuatbanService.addNhaxuatban(nhaxuatban) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updatenhaxuatban", method = RequestMethod.PUT)
	public HttpStatus updateNhaxuatban(@RequestBody Nhaxuatban nhaxuatban) {
		return nhaxuatbanService.updateNhaxuatban(nhaxuatban) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
