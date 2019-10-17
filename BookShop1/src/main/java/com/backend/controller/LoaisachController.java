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

import com.backend.entity.Loaisach;
import com.backend.service.LoaisachService;

@CrossOrigin
@Controller
public class LoaisachController {


	@Autowired
	LoaisachService loaisachService;
	
	@RequestMapping(value = "/loaisachs", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Loaisach>> findAllLoaisach() {
        List<Loaisach> loaisach = loaisachService.getAllloaisach();
        if (loaisach.isEmpty()) {
            return new ResponseEntity<List<Loaisach>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Loaisach>>(loaisach, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/loaisach/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Loaisach> getAllloaisach(@PathVariable Integer id) {
			return loaisachService.getById(id);
		}
	 	
	
	@RequestMapping(value = "/loaisach/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteBLoaisach(@PathVariable Integer id) {
		loaisachService.deleteLoaisach(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addloaisach", method = RequestMethod.POST)
	public HttpStatus insertLoaisach(@RequestBody Loaisach loaisach) {
		return loaisachService.addLoaisach(loaisach) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updateloaisach", method = RequestMethod.PUT)
	public HttpStatus updateLoaisach(@RequestBody Loaisach loaisach) {
		return loaisachService.updateLoaisach(loaisach) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
