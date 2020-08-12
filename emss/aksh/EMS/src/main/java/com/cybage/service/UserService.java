package com.cybage.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cybage.Repository.UserRepository;
import com.cybage.model.User;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository uesrRepository;


	/*public List<User> getAllUser() {
		List<User> empList = new ArrayList<User>();
		uesrRepository.findAll().forEach(empList::add);
		return empList;
	}*/

	public List<User> getAllUser() {
		
		return( List<User>) uesrRepository.findAll();
	}

	public void addUsers(User employee) {
		
		uesrRepository.save(employee);
	}


	public Optional<User> getSingleUserById(Long id) {
		
		 return uesrRepository.findById(id);
	}


	public void deleteUserById(Long id) {
	
		uesrRepository.deleteById(id);
		
	}


	

	
	
	

}
