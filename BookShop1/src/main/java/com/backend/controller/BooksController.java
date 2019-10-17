package com.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.backend.entity.Books;
import com.backend.service.BooksService;

@CrossOrigin
@Controller
public class BooksController {

	@Autowired
	BooksService booksService;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	
	 public ResponseEntity<List<Books>> findAllBooks() {
        List<Books> books = booksService.getAllbooks();
        if (books.isEmpty()) {
            return new ResponseEntity<List<Books>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Books>>(books, HttpStatus.OK);
    }
	
	 @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
		public @ResponseBody Optional<Books> getAllbook(@PathVariable Integer id) {
			return booksService.getById(id);
		}
	 	
	@RequestMapping(value = "/searchByContain/{name}", method =
	RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) public
	List<Books> searchByContainName(@PathVariable String name) { return
			booksService.findByContainingName(name); }
	 
	
	@RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteBook(@PathVariable Integer id) {
		booksService.deleteBook(id);;
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public HttpStatus insertBook(@RequestBody Books book) {
		return booksService.addBook(book) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/updatebook", method = RequestMethod.PUT)
	public HttpStatus updateBook(@RequestBody Books book) {
		return booksService.updateBook(book) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
