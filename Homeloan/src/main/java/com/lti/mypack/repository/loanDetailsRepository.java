package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.loanDetails;

@Repository
public interface loanDetailsRepository extends JpaRepository<loanDetails, String> {

}