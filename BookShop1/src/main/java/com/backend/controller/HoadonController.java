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

import com.backend.entity.Hoadon;
import com.backend.service.HoadonService;

@CrossOrigin
@Controller
public class HoadonController {

	@Autowired
	HoadonService hoadonService;
	
	@RequestMapping(value = "/hoadons", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Hoadon>> findAllHoadon() {
        List<Hoadon> hoadon = hoadonService.getAllhoadon();
        if (hoadon.isEmpty()) {
            return new ResponseEntity<List<Hoadon>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Hoadon>>(hoadon, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/hoadon/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Hoadon> getAllhoadon(@PathVariable Integer id) {
			return hoadonService.getById(id);
		}
	 	
	
	@RequestMapping(value = "/hoadon/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteHoadon(@PathVariable Integer id) {
		hoadonService.deleteHoadon(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addhoadon", method = RequestMethod.POST)
	public HttpStatus insertHoadon(@RequestBody Hoadon hoadon) {
		return hoadonService.addHoadon(hoadon) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updatehoadon", method = RequestMethod.PUT)
	public HttpStatus updateHoadon(@RequestBody Hoadon hoadon) {
		return hoadonService.updateHoadon(hoadon) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
