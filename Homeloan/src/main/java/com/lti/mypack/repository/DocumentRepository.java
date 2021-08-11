package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.mypack.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer>{

}
