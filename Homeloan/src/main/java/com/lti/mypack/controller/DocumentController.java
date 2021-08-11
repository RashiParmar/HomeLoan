package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Document;
import com.lti.mypack.service.DocumentService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("homeloanrest/api")
public class DocumentController {
	
	@Autowired
	DocumentService dService;

	@GetMapping("/document")
	public  List<Document> getDocument(){
		return dService.getdocument();
	}

	@PostMapping("/document/{custid}")
	public boolean addDocument(@RequestBody Document document) {
		return dService.addDocument(document);
	}
}
