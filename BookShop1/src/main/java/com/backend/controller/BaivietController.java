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

import com.backend.entity.Baiviet;
import com.backend.service.BaivietService;

@CrossOrigin
@Controller
public class BaivietController {
	
	@Autowired
	BaivietService baivietService;
	
	@RequestMapping(value = "/baiviets", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Baiviet>> findAllBaiviet() {
        List<Baiviet> baiviet = baivietService.getAllbaiviet();
        if (baiviet.isEmpty()) {
            return new ResponseEntity<List<Baiviet>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Baiviet>>(baiviet, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/baiviet/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Baiviet> getAllbaiviet(@PathVariable Integer id) {
			return baivietService.getById(id);
		}
	 	
	 
	@RequestMapping(value = "/baiviet/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteBaiviet(@PathVariable Integer id) {
		baivietService.deleteBaiviet(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addbaiviet", method = RequestMethod.POST)
	public HttpStatus insertBaiviet(@RequestBody Baiviet baiviet) {
		return baivietService.addBaiviet(baiviet) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updatebaiviet", method = RequestMethod.PUT)
	public HttpStatus updateBaiviet(@RequestBody Baiviet baiviet) {
		return baivietService.updateBaiviet(baiviet) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}

}
