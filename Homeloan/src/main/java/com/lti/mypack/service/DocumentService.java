package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Document;


public interface DocumentService {
	public List<Document> getdocument();
	
	public boolean addDocument(Document document);

}