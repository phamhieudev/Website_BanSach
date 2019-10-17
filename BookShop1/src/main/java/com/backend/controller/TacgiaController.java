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

import com.backend.entity.Tacgia;
import com.backend.service.BooksService;
import com.backend.service.TacgiaService;

@CrossOrigin
@Controller
public class TacgiaController {

	
	@Autowired
	TacgiaService tacgiaService;
	
	@RequestMapping(value = "/tacgias", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Tacgia>> findAllTacgia() {
        List<Tacgia> tacgia = tacgiaService.getAlltacgia();
        if (tacgia.isEmpty()) {
            return new ResponseEntity<List<Tacgia>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Tacgia>>(tacgia, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/tacgia/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Tacgia> getAlltacgia(@PathVariable Integer id) {
			return tacgiaService.getById(id);
		}
	 	
	
	@RequestMapping(value = "/tacgia/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteTacgia(@PathVariable Integer id) {
		tacgiaService.deleteTacgia(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addtacgia", method = RequestMethod.POST)
	public HttpStatus insertTacgia(@RequestBody Tacgia tacgia) {
		return tacgiaService.addTacgia(tacgia) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updatetacgia", method = RequestMethod.PUT)
	public HttpStatus updateTacgia(@RequestBody Tacgia tacgia) {
		return tacgiaService.updateTacgia(tacgia) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
