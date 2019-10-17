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

import com.backend.entity.Chitiethoadon;
import com.backend.service.ChitiethoadonService;

@CrossOrigin
@Controller
public class ChitiethoadonController {

	@Autowired
	ChitiethoadonService chitiethoadonService;
	
	@RequestMapping(value = "/chitiethoadons", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Chitiethoadon>> findAllChitiethoadon() {
        List<Chitiethoadon> chitiethoadon = chitiethoadonService.getAllchitiethoadon();
        if (chitiethoadon.isEmpty()) {
            return new ResponseEntity<List<Chitiethoadon>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Chitiethoadon>>(chitiethoadon, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/chitiethoadon/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Chitiethoadon> getAllchitiethoadon(@PathVariable Integer id) {
			return chitiethoadonService.getById(id);
		}
	 
	
	@RequestMapping(value = "/chitiethoadon/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteChitiethoadon(@PathVariable Integer id) {
		chitiethoadonService.deleteChitiethoadon(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addchitiethoadon", method = RequestMethod.POST)
	public HttpStatus insertChitiethoado(@RequestBody Chitiethoadon chitiethoadon) {
		return chitiethoadonService.addChitiethoadon(chitiethoadon) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updatechitiethoadon", method = RequestMethod.PUT)
	public HttpStatus updateChitiethoadon(@RequestBody Chitiethoadon chitiethoadon) {
		return chitiethoadonService.updateChitiethoadon(chitiethoadon) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
