package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Application;
import com.lti.mypack.repository.ApplicationRepository;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	ApplicationRepository appRepo;
	@Override
	public List<Application> getApplication() {
		
		return appRepo.findAll();
	}

	@Override
	public boolean addApplication(Application application) {
		appRepo.save(application);
		return true;
	}

}
